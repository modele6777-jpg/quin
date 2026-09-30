package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class lt0 implements ak0 {
    public wj0 b;
    public wj0 c;
    public wj0 d;
    public wj0 e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public lt0() {
        ByteBuffer byteBuffer = ak0.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        wj0 wj0Var = wj0.e;
        this.d = wj0Var;
        this.e = wj0Var;
        this.b = wj0Var;
        this.c = wj0Var;
    }

    public abstract wj0 a(wj0 wj0Var);

    @Override // defpackage.ak0
    public boolean b() {
        return this.e != wj0.e;
    }

    @Override // defpackage.ak0
    public boolean c() {
        return this.h && this.g == ak0.a;
    }

    @Override // defpackage.ak0
    public ByteBuffer d() {
        ByteBuffer byteBuffer = this.g;
        this.g = ak0.a;
        return byteBuffer;
    }

    @Override // defpackage.ak0
    public final void e(yj0 yj0Var) {
        this.g = ak0.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        j();
    }

    @Override // defpackage.ak0
    public final wj0 g(wj0 wj0Var) {
        this.d = wj0Var;
        this.e = a(wj0Var);
        return b() ? this.e : wj0.e;
    }

    @Override // defpackage.ak0
    public final void h() {
        this.h = true;
        k();
    }

    public final ByteBuffer m(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    @Override // defpackage.ak0
    public final void reset() {
        ByteBuffer byteBuffer = ak0.a;
        this.g = byteBuffer;
        this.h = false;
        this.f = byteBuffer;
        wj0 wj0Var = wj0.e;
        this.d = wj0Var;
        this.e = wj0Var;
        this.b = wj0Var;
        this.c = wj0Var;
        l();
    }

    public void j() {
    }

    public void k() {
    }

    public void l() {
    }
}
