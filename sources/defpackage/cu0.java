package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class cu0 implements au0 {
    public final bp7 a;
    public float b = -1.0f;

    public cu0(List list) {
        this.a = (bp7) list.get(0);
    }

    @Override // defpackage.au0
    public final boolean isEmpty() {
        return false;
    }

    @Override // defpackage.au0
    public final boolean o(float f) {
        if (this.b == f) {
            return true;
        }
        this.b = f;
        return false;
    }

    @Override // defpackage.au0
    public final bp7 p() {
        return this.a;
    }

    @Override // defpackage.au0
    public final boolean q(float f) {
        return !this.a.c();
    }

    @Override // defpackage.au0
    public final float u() {
        return this.a.a();
    }

    @Override // defpackage.au0
    public final float v() {
        return this.a.b();
    }
}
