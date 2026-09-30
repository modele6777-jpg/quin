package defpackage;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class e9e implements q8c {
    public final f9e a;

    public e9e(f9e f9eVar) {
        f9eVar.getClass();
        this.a = f9eVar;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00ca  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.q8c
    public final x8c W0(String str) {
        k9e k9eVar;
        int i;
        str.getClass();
        f9e f9eVar = this.a;
        gec gecVar = null;
        if (!f9eVar.isOpen()) {
            p8c.x(21, "connection is closed");
            throw null;
        }
        String upperCase = v4e.o0(str).toString().toUpperCase(Locale.ROOT);
        upperCase.getClass();
        int length = upperCase.length() - 2;
        int i2 = -1;
        if (length >= 0) {
            int iN = 0;
            loop0: while (iN < length) {
                char cCharAt = upperCase.charAt(iN);
                if (pa7.L(cCharAt, 32) > 0) {
                    if (cCharAt != '-') {
                        if (cCharAt == '/') {
                            int iN2 = iN + 1;
                            if (upperCase.charAt(iN2) == '*') {
                                do {
                                    iN2 = v4e.N(upperCase, '*', iN2 + 1, 4);
                                    if (iN2 < 0) {
                                        break loop0;
                                    }
                                    i = iN2 + 1;
                                    if (i >= length) {
                                        break;
                                    }
                                } while (upperCase.charAt(i) != '/');
                                iN = iN2 + 2;
                            }
                        }
                        i2 = iN;
                        break;
                    }
                    if (upperCase.charAt(iN + 1) != '-') {
                        i2 = iN;
                        break;
                    }
                    iN = v4e.N(upperCase, '\n', iN + 2, 4);
                    if (iN < 0) {
                        break;
                    }
                }
                iN++;
            }
        }
        String strSubstring = (i2 < 0 || i2 > upperCase.length()) ? null : upperCase.substring(i2, Math.min(i2 + 3, upperCase.length()));
        if (strSubstring == null) {
            return new l9e(f9eVar, str);
        }
        switch (strSubstring.hashCode()) {
            case 65636:
                if (!strSubstring.equals("BEG")) {
                    k9eVar = null;
                } else if (!v4e.F(upperCase, "EXCLUSIVE", false)) {
                    k9eVar = !v4e.F(upperCase, "IMMEDIATE", false) ? k9e.e : k9e.d;
                } else {
                    k9eVar = k9e.c;
                }
                break;
            case 66913:
                if (!strSubstring.equals("COM")) {
                    k9eVar = null;
                } else {
                    k9eVar = k9e.a;
                }
                break;
            case 68795:
                if (!strSubstring.equals("END")) {
                    k9eVar = null;
                } else {
                    k9eVar = k9e.a;
                }
                break;
            case 81327:
                k9eVar = (!strSubstring.equals("ROL") || v4e.F(upperCase, " TO ", false)) ? null : k9e.b;
                break;
            default:
                k9eVar = null;
                break;
        }
        if (k9eVar != null) {
            return new l9e(f9eVar, str, k9eVar);
        }
        if (strSubstring.equals("PRA")) {
            String lowerCase = upperCase.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (v4e.F(v4e.f0(lowerCase, "journal_mode", ""), "=", false)) {
                gecVar = gec.w;
            }
        }
        if (gecVar != null) {
            return new l9e(f9eVar, str, new m9e(f9eVar, str));
        }
        int iHashCode = strSubstring.hashCode();
        return (iHashCode == 79487 ? !strSubstring.equals("PRA") : iHashCode == 81978 ? !strSubstring.equals("SEL") : !(iHashCode == 85954 && strSubstring.equals("WIT"))) ? new l9e(f9eVar, str) : new m9e(f9eVar, str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // defpackage.q8c
    public final boolean q() {
        return this.a.q();
    }
}
