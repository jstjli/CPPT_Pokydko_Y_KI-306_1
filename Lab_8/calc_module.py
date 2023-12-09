# calc_module.py

import os
import struct
import math

def writeResTxt(fName, result):
    with open(fName, 'w') as f:
        f.write(str(result))

def readResTxt(fName):
    try:
        if os.path.exists(fName):
            with open(fName, 'r') as f:
                return float(f.read())
        else:
            raise FileNotFoundError(f"File {fName} not found.")
    except FileNotFoundError as e:
        print(e)
        return 0.0

def writeResBin(fName, result):
    with open(fName, 'wb') as f:
        f.write(struct.pack('f', result))

def readResBin(fName):
    try:
        if os.path.exists(fName):
            with open(fName, 'rb') as f:
                return struct.unpack('f', f.read())[0]
        else:
            raise FileNotFoundError(f"File {fName} not found.")
    except FileNotFoundError as e:
        print(e)
        return 0.0

def calculate(x):
    numerator = math.cos(2 * x)
    denominator = math.cos(3 * x - 1) / math.sin(3 * x - 1)
    return numerator / denominator
