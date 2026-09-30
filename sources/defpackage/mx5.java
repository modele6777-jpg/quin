package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mx5 extends qk2 implements pwf, vm9, mf, kdc, cy5 {
    public final Activity G0;
    public final Context H0;
    public final Handler I0;
    public final zx5 J0;
    public final /* synthetic */ nx5 K0;

    public mx5(nx5 nx5Var) {
        super(19);
        this.K0 = nx5Var;
        Handler handler = new Handler();
        this.G0 = nx5Var;
        this.H0 = nx5Var;
        this.I0 = handler;
        this.J0 = new zx5();
    }

    @Override // defpackage.qk2
    public final View H(int i) {
        return this.K0.findViewById(i);
    }

    @Override // defpackage.qk2
    public final boolean I() {
        Window window = this.K0.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // defpackage.vm9
    public final um9 b() {
        return this.K0.b();
    }

    @Override // defpackage.mf
    public final tb2 f() {
        return this.K0.w;
    }

    @Override // defpackage.pwf
    public final owf g() {
        return this.K0.g();
    }

    @Override // defpackage.kdc
    public final vea h() {
        return (vea) this.K0.d.c;
    }

    @Override // defpackage.x48
    public final h48 k() {
        return this.K0.L0;
    }

    @Override // defpackage.cy5
    public final void a() {
    }
}
