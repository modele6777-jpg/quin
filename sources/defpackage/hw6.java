package defpackage;

import androidx.camera.core.ImageProcessingUtil;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hw6 implements fs5 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    public /* synthetic */ hw6(iw6 iw6Var, iw6 iw6Var2) {
        this.b = iw6Var2;
    }

    @Override // defpackage.fs5
    public final void a(gs5 gs5Var) throws Exception {
        cee ceeVar;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = ImageProcessingUtil.a;
                ((iw6) obj).close();
                return;
            default:
                sbc sbcVar = (sbc) obj;
                synchronized (sbcVar.a) {
                    try {
                        int i3 = sbcVar.b - 1;
                        sbcVar.b = i3;
                        if (sbcVar.c && i3 == 0) {
                            sbcVar.close();
                        }
                        ceeVar = sbcVar.f;
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (ceeVar != null) {
                    ceeVar.a(gs5Var);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ hw6(sbc sbcVar) {
        this.b = sbcVar;
    }
}
