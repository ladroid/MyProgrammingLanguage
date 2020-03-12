import random

# dna count
def count_dna(dna, base):
    print('dna', dna)
    print('base', base)
    i = 0 # counter
    for c in dna:
        print('c:', c)
        if c == base:
            print('True if test')
            i += 1
    return i

# generating dna random sequence
def generate_dna_sequence(length):
    return ''.join(random.choice(list('ACTG')) for _ in range(length))

# making dna frequency 
def dna_frequency_map(dna, k):
    freq = {}
    n = len(dna)
    for i in range(n-k+1):
        pattern = dna[i:i+k]
        if pattern not in freq:
            freq[pattern] = 1
        else:
            freq[pattern] += 1
    return freq

# reading dna from file
def read_dnafile(filename):
    lines = open(filename, 'r').readlines()
    # Remove newlines in each line and join
    dna = ''.join([line.strip() for line in lines])
    return dna

# dna to protein
def translate_to_protein(filename):
    f = open(filename, 'r')
    seq = f.read()
    seq = seq.replace("\n", "")
    seq = seq.replace("\r", "")

    table = {
        'ATA': 'I', 'ATC': 'I', 'ATT': 'I', 'ATG': 'M',
        'ACA': 'T', 'ACC': 'T', 'ACG': 'T', 'ACT': 'T',
        'AAC': 'N', 'AAT': 'N', 'AAA': 'K', 'AAG': 'K',
        'AGC': 'S', 'AGT': 'S', 'AGA': 'R', 'AGG': 'R',                  
        'CTA': 'L', 'CTC': 'L', 'CTG': 'L', 'CTT': 'L', 
        'CCA': 'P', 'CCC': 'P', 'CCG': 'P', 'CCT': 'P', 
        'CAC': 'H', 'CAT': 'H', 'CAA': 'Q', 'CAG': 'Q', 
        'CGA': 'R', 'CGC': 'R', 'CGG': 'R', 'CGT': 'R', 
        'GTA': 'V', 'GTC': 'V', 'GTG': 'V', 'GTT': 'V', 
        'GCA': 'A', 'GCC': 'A', 'GCG': 'A', 'GCT': 'A', 
        'GAC': 'D', 'GAT': 'D', 'GAA': 'E', 'GAG': 'E', 
        'GGA': 'G', 'GGC': 'G', 'GGG': 'G', 'GGT': 'G', 
        'TCA': 'S', 'TCC': 'S', 'TCG': 'S', 'TCT': 'S', 
        'TTC': 'F', 'TTT': 'F', 'TTA': 'L', 'TTG': 'L', 
        'TAC': 'Y', 'TAT': 'Y', 'TAA': '_', 'TAG': '_', 
        'TGC': 'C', 'TGT': 'C', 'TGA': '_', 'TGG': 'W', 
    }
    protein = ''
    if len(seq)%3 == 0:
        for i in range(0, len(seq)):
            codon = seq[i: i+3]
            protein += table[codon]
    return protein

# generate dna mutation
def mutate(dna, mutation, threshold):
    dna = list(dna)
    for index, char in enumerate(dna):
        if char in mutation:
            if random.random() < threshold:
                dna[index] = mutation[char]
    return ''.join(dna)

# dna reverse complement
'''
    **How to use**
    seq = "TCGGinsGCCC"
    print ("Reverse Complement:")
    print(reverse_complement(seq))
'''

alt_map = {'ins':'0'}
complement = {'A': 'T', 'C': 'G', 'G': 'C', 'T': 'A'} 

def reverse_complement(seq):    
    for k,v in alt_map.items():
        seq = seq.replace(k,v)
    bases = list(seq) 
    bases = reversed([complement.get(base,base) for base in bases])
    bases = ''.join(bases)
    for k,v in alt_map.items():
        bases = bases.replace(v,k)
    return bases
    
# count non-DNA bases in a sequence 
'''
** How to use**
print(count_dna("ACTRGATCYGATCGANTCGATG"))
print(count_dna("ACTRGATCYGATCGANTCGATG", ['A','T','C','G','N']))
print(count_dna("actgratcygtganctttgacg"))
'''       
def count_non_dna_bases_seq(seq, allowed_bases=['A','T','G','C']):
    seq = seq.upper()
    total_dna_bases = 0
    for base in allowed_bases:
        total_dna_bases = total_dna_bases + seq.count(base.upper())
    dna_fraction = total_dna_bases / len(seq)
    return(dna_fraction * 100)

# dna concatenate
def dna_concat(dna1, dna2):
    return dna1 + dna2

# dna sequence alignment
def sequence_alignment(score, seq1, seq2):
    alphabet = ['A', 'C', 'G', 'T']
    D = []
    for i in range(len(seq1)+1):
        D.append([0] * (len(seq2)+1))
    for i in range(1, len(seq1)+1):
        D[i][0] = D[i-1][0] + score[alphabet.index(seq1[i-1])][i-1]
    for i in range(1, len(seq2)+1):
        D[0][i] = D[0][i-1] + score[-1][alphabet.index(seq2[i-1])]
    for i in range(1, len(seq1) + 1):
        for j in range(1, len(seq2) + 1):
            distHor = D[i][j-1] + score[-1][alphabet.index(seq2[j-1])]
            distVer = D[i][j] + score[alphabet.index(seq1[i-1])][-1]
            if seq1[i-1] == seq2[j-1]:
                distDiag = D[i-1][j-1]
            else:
                distDiag = D[i-1][j-1] + score[alphabet.index(seq1[i-1])][alphabet.index(seq2[j-1])]
            D[i][j] = min(distHor, distVer, distDiag)
    return D[-1][-1]

# find motif in dna sequence
def motif(s, t):
    result = []
    len1 = len(s)
    len2 = len(t)
    for i in range(0, len1 - len2 + 1): 
        if s[i:i+len2] == t:
            result.append(i+1)
    return result

# protein mass calculator
def protein_mass(pmass):
    mass_table = {
        'A':   71.03711,  'C':   103.00919,  'D':   115.02694,
        'E':   129.04259, 'F':   147.06841,  'G':   57.02146,
        'H':   137.05891, 'I':   113.08406,  'K':   128.09496,
        'L':   113.08406, 'M':   131.04049,  'N':   114.04293,
        'P':   97.05276,  'Q':   128.05858,  'R':   156.10111,
        'S':   87.03203,  'T':   101.04768,  'V':   99.06841,
        'W':   186.07931, 'Y':   163.06333,
    }
    n = 0
    for i in pmass:
        n += mass_table[i]
    return n