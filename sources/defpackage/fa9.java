package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fa9 {
    public final da9 a;
    public final ua9 b;
    public final Bundle c;
    public g48 d;
    public final na9 e;
    public final String f;
    public final Bundle g;
    public final lqb h;
    public boolean i;
    public final a58 j;
    public g48 k;
    public final ldc l;
    public final ace m;

    public fa9(da9 da9Var) {
        this.a = da9Var;
        this.b = da9Var.b;
        this.c = da9Var.c;
        this.d = da9Var.d;
        this.e = da9Var.e;
        this.f = da9Var.f;
        this.g = da9Var.g;
        this.h = new lqb(new jdc(da9Var, new hla(15, da9Var)));
        ace aceVar = new ace(new fk8(16));
        this.j = new a58(da9Var, true);
        this.k = g48.b;
        this.l = (ldc) aceVar.getValue();
        this.m = new ace(new fk8(17));
    }

    public final Bundle a() {
        Bundle bundle = this.c;
        if (bundle == null) {
            return null;
        }
        Bundle bundleR = feg.r((iy9[]) Arrays.copyOf(new iy9[0], 0));
        bundleR.putAll(bundle);
        return bundleR;
    }

    public final void b() {
        if (!this.i) {
            lqb lqbVar = this.h;
            lqbVar.o();
            this.i = true;
            if (this.e != null) {
                cdc.b(this.a);
            }
            lqbVar.p(this.g);
        }
        int iOrdinal = this.d.ordinal();
        int iOrdinal2 = this.k.ordinal();
        a58 a58Var = this.j;
        if (iOrdinal < iOrdinal2) {
            a58Var.g(this.d);
        } else {
            a58Var.g(this.k);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(job.a.b(da9.class).r());
        sb.append("(" + this.f + ')');
        sb.append(" destination=");
        sb.append(this.b);
        return sb.toString();
    }
}
