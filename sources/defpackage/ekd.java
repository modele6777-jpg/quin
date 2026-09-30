package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ekd extends gye {
    public static final Object g = new Object();
    public final long b;
    public final long c;
    public final boolean d;
    public final op8 e;
    public final kp8 f;

    static {
        d82 d82Var = new d82();
        new eu4();
        List list = Collections.EMPTY_LIST;
        ey6 ey6Var = jy6.b;
        yob yobVar = yob.e;
        jp8 jp8Var = new jp8();
        mp8 mp8Var = mp8.a;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new lp8(uri, null, null, list, yobVar, -9223372036854775807L);
        }
        new ip8(d82Var);
        new kp8(jp8Var);
        rp8 rp8Var = rp8.C;
    }

    public ekd(long j, boolean z, boolean z2, op8 op8Var) {
        kp8 kp8Var = z2 ? op8Var.c : null;
        this.b = j;
        this.c = j;
        this.d = z;
        op8Var.getClass();
        this.e = op8Var;
        this.f = kp8Var;
    }

    @Override // defpackage.gye
    public final int b(Object obj) {
        return g != obj ? -1 : 0;
    }

    @Override // defpackage.gye
    public final eye f(int i, eye eyeVar, boolean z) {
        pa7.C(i, 1);
        Object obj = z ? g : null;
        qf qfVar = qf.c;
        eyeVar.h(null, obj, 0, this.b, 0L, false);
        return eyeVar;
    }

    @Override // defpackage.gye
    public final int h() {
        return 1;
    }

    @Override // defpackage.gye
    public final Object l(int i) {
        pa7.C(i, 1);
        return g;
    }

    @Override // defpackage.gye
    public final fye m(int i, fye fyeVar, long j) {
        pa7.C(i, 1);
        Object obj = fye.o;
        fyeVar.b(this.e, this.d, false, this.f, 0L, this.c);
        return fyeVar;
    }

    @Override // defpackage.gye
    public final int o() {
        return 1;
    }
}
