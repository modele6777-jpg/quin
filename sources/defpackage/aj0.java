package defpackage;

import android.os.Build;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class aj0 {
    public static final aj0 d;
    public final int a;
    public final int b;
    public final ry6 c;

    static {
        aj0 aj0Var;
        if (Build.VERSION.SDK_INT >= 33) {
            py6 py6Var = new py6(4);
            for (int i = 1; i <= 10; i++) {
                py6Var.b(Integer.valueOf(pqf.p(i)));
            }
            aj0Var = new aj0(2, py6Var.h());
        } else {
            aj0Var = new aj0(2, 10);
        }
        d = aj0Var;
    }

    public aj0(int i, Set set) {
        this.a = i;
        ry6 ry6VarN = ry6.n(set);
        this.c = ry6VarN;
        gff it = ry6VarN.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.b = iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj0)) {
            return false;
        }
        aj0 aj0Var = (aj0) obj;
        return this.a == aj0Var.a && this.b == aj0Var.b && Objects.equals(this.c, aj0Var.c);
    }

    public final int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        ry6 ry6Var = this.c;
        return i + (ry6Var == null ? 0 : ry6Var.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.a + ", maxChannelCount=" + this.b + ", channelMasks=" + this.c + "]";
    }

    public aj0(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = null;
    }
}
