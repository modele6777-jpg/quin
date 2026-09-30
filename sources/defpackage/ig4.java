package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ig4 implements cvd {
    public final /* synthetic */ int a;
    public final String b;

    public /* synthetic */ ig4(String str, int i) {
        this.a = i;
        this.b = str;
    }

    public static ig4 a(d0a d0aVar) {
        String str;
        d0aVar.N(2);
        int iZ = d0aVar.z();
        int i = iZ >> 1;
        int iZ2 = ((d0aVar.z() >> 3) & 31) | ((iZ & 1) << 5);
        if (i == 4 || i == 5 || i == 7 || i == 8) {
            str = "dvhe";
        } else if (i == 9) {
            str = "dvav";
        } else {
            if (i != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append(i < 10 ? ".0" : ".");
        sb.append(i);
        return new ig4(ub3.h(iZ2, iZ2 < 10 ? ".0" : ".", sb), 0);
    }

    @Override // defpackage.cvd
    public Iterator b(j27 j27Var, CharSequence charSequence) {
        return new avd(this, j27Var, charSequence, 1);
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return ub3.l(new StringBuilder("<"), this.b, '>');
            default:
                return super.toString();
        }
    }
}
