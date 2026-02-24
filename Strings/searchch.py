def search(s,ch):
    for i in range(len(s)):
        if s[i]==ch:
            return i
    return -1
if __name__=="__main__":
    s="nandeesh"
    ch='a'
    print(search(s,ch))