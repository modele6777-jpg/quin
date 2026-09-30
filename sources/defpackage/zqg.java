package defpackage;

import com.adjust.sdk.sig.r3;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class zqg implements Iterator {
    public final /* synthetic */ int a;
    public int b = 0;
    public final /* synthetic */ Object c;

    public /* synthetic */ zqg(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                return this.b < ((erg) obj).a.length();
            case 1:
                return this.b < ((erg) obj).a.length();
            default:
                return this.b < ((smg) obj).p();
        }
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                String str = ((erg) obj).a;
                int i2 = this.b;
                if (i2 < str.length()) {
                    this.b = i2 + 1;
                    return new erg(String.valueOf(i2));
                }
                s8f.c();
                return null;
            case 1:
                String str2 = ((erg) obj).a;
                int i3 = this.b;
                if (i3 < str2.length()) {
                    this.b = i3 + 1;
                    return new erg(String.valueOf(str2.charAt(i3)));
                }
                s8f.c();
                return null;
            default:
                smg smgVar = (smg) obj;
                int i4 = this.b;
                int iP = smgVar.p();
                int i5 = this.b;
                if (i4 < iP) {
                    this.b = i5 + 1;
                    return smgVar.q(i5);
                }
                r3.n(ub3.h(i5, "Out of bounds index: ", new StringBuilder(String.valueOf(i5).length() + 21)));
                return null;
        }
    }
}
