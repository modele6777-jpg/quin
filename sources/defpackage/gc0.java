package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gc0 implements yn8 {
    public final /* synthetic */ int a;
    public final int b;
    public final int c;
    public final Map d;
    public final a26 e;
    public final /* synthetic */ a26 f;
    public final /* synthetic */ zn8 g;

    public /* synthetic */ gc0(int i, int i2, Map map, a26 a26Var, a26 a26Var2, zn8 zn8Var, int i3) {
        this.a = i3;
        this.f = a26Var2;
        this.g = zn8Var;
        this.b = i;
        this.c = i2;
        this.d = map;
        this.e = a26Var;
    }

    @Override // defpackage.yn8
    public final Map a() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.d;
    }

    @Override // defpackage.yn8
    public final void b() {
        int i = this.a;
        zn8 zn8Var = this.g;
        a26 a26Var = this.f;
        switch (i) {
            case 0:
                a26Var.d(((hc0) zn8Var).a.E0);
                break;
            default:
                a26Var.d(((lg8) zn8Var).E0);
                break;
        }
    }

    @Override // defpackage.yn8
    public final int c() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.c;
    }

    @Override // defpackage.yn8
    public final int d() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b;
    }

    @Override // defpackage.yn8
    public final a26 g() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.e;
    }
}
