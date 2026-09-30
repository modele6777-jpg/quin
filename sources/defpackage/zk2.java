package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class zk2 implements gg9 {
    public final String a;

    public zk2(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // defpackage.sr5
    public final as5 a() {
        return new gh2(this.a);
    }

    @Override // defpackage.sr5
    public final n0a b() {
        List listN;
        String strSubstring;
        String strSubstring2 = this.a;
        int length = strSubstring2.length();
        pu4 pu4Var = pu4.a;
        if (length == 0) {
            listN = pu4Var;
        } else {
            c78 c78VarW = t72.w();
            String strSubstring3 = "";
            if (uyb.t(strSubstring2.charAt(0))) {
                int length2 = strSubstring2.length();
                int i = 0;
                while (true) {
                    if (i >= length2) {
                        strSubstring = strSubstring2;
                        break;
                    }
                    if (!uyb.t(strSubstring2.charAt(i))) {
                        strSubstring = strSubstring2.substring(0, i);
                        break;
                    }
                    i++;
                }
                c78VarW.add(new fk9(t72.H(new al2(strSubstring))));
                int length3 = strSubstring2.length();
                int i2 = 0;
                while (true) {
                    if (i2 >= length3) {
                        strSubstring2 = "";
                        break;
                    }
                    if (!uyb.t(strSubstring2.charAt(i2))) {
                        strSubstring2 = strSubstring2.substring(i2);
                        break;
                    }
                    i2++;
                }
            }
            if (strSubstring2.length() > 0) {
                if (uyb.t(strSubstring2.charAt(strSubstring2.length() - 1))) {
                    int length4 = strSubstring2.length();
                    while (true) {
                        length4--;
                        if (-1 >= length4) {
                            break;
                        }
                        if (!uyb.t(strSubstring2.charAt(length4))) {
                            strSubstring3 = strSubstring2.substring(0, length4 + 1);
                            break;
                        }
                    }
                    c78VarW.add(new qea(strSubstring3));
                    for (int length5 = strSubstring2.length() - 1; -1 < length5; length5--) {
                        if (!uyb.t(strSubstring2.charAt(length5))) {
                            strSubstring2 = strSubstring2.substring(length5 + 1);
                            break;
                        }
                    }
                    c78VarW.add(new fk9(t72.H(new al2(strSubstring2))));
                } else {
                    c78VarW.add(new qea(strSubstring2));
                }
            }
            listN = c78VarW.n();
        }
        return new n0a(listN, pu4Var);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zk2) {
            return pa7.t(this.a, ((zk2) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ub3.l(new StringBuilder("ConstantFormatStructure("), this.a, ')');
    }
}
