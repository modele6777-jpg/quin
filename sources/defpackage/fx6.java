package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fx6 {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final long f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final ex6 j;
    public boolean k;

    public fx6(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, int i2) {
        str = (i2 & 1) != 0 ? "" : str;
        long j2 = (i2 & 32) != 0 ? y72.k : j;
        int i3 = (i2 & 64) != 0 ? 5 : i;
        boolean z2 = (i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? false : z;
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = j2;
        this.g = i3;
        this.h = z2;
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        ex6 ex6Var = new ex6(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.j = ex6Var;
        arrayList.add(ex6Var);
    }

    public static void a(fx6 fx6Var, ArrayList arrayList, dtd dtdVar, float f, float f2, int i, float f3) {
        if (fx6Var.k) {
            i37.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ((ex6) ks0.f(1, fx6Var.i)).j.add(new osf("", arrayList, 0, dtdVar, f, null, 1.0f, f2, 0, i, f3, 0.0f, 1.0f, 0.0f));
    }

    public final gx6 b() {
        if (this.k) {
            i37.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (true) {
            ArrayList arrayList = this.i;
            if (arrayList.size() <= 1) {
                ex6 ex6Var = this.j;
                gx6 gx6Var = new gx6(this.a, this.b, this.c, this.d, this.e, new lsf(ex6Var.a, ex6Var.b, ex6Var.c, ex6Var.d, ex6Var.e, ex6Var.f, ex6Var.g, ex6Var.h, ex6Var.i, ex6Var.j), this.f, this.g, this.h);
                this.k = true;
                return gx6Var;
            }
            if (this.k) {
                i37.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            ex6 ex6Var2 = (ex6) arrayList.remove(arrayList.size() - 1);
            ((ex6) ks0.f(1, arrayList)).j.add(new lsf(ex6Var2.a, ex6Var2.b, ex6Var2.c, ex6Var2.d, ex6Var2.e, ex6Var2.f, ex6Var2.g, ex6Var2.h, ex6Var2.i, ex6Var2.j));
        }
    }
}
