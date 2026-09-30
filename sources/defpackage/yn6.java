package defpackage;

import coil3.compose.AsyncImagePainter$State$Error;
import coil3.compose.AsyncImagePainter$State$Loading;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yn6 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fy9 b;

    public /* synthetic */ yn6(fy9 fy9Var, int i) {
        this.a = i;
        this.b = fy9Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        fy9 fy9Var = this.b;
        switch (i) {
            case 0:
                h81 h81Var = (h81) obj;
                h81Var.getClass();
                return h81Var.a(new yn6(fy9Var, 1));
            case 1:
                sn4 sn4Var = (sn4) obj;
                sn4Var.getClass();
                fy9.h(this.b, sn4Var, sn4Var.f(), 0.0f, 6);
                return wefVar;
            case 2:
                h81 h81Var2 = (h81) obj;
                h81Var2.getClass();
                return h81Var2.a(new yn6(fy9Var, 3));
            case 3:
                sn4 sn4Var2 = (sn4) obj;
                sn4Var2.getClass();
                fy9.h(this.b, sn4Var2, sn4Var2.f(), 0.0f, 6);
                return wefVar;
            default:
                yg0 yg0Var = (yg0) obj;
                if (yg0Var instanceof AsyncImagePainter$State$Loading) {
                    return (AsyncImagePainter$State$Loading) yg0Var;
                }
                if (!(yg0Var instanceof AsyncImagePainter$State$Error)) {
                    return yg0Var;
                }
                AsyncImagePainter$State$Error asyncImagePainter$State$Error = (AsyncImagePainter$State$Error) yg0Var;
                ly4 ly4Var = asyncImagePainter$State$Error.a;
                return (!(ly4Var.c instanceof qj9) || fy9Var == null) ? asyncImagePainter$State$Error : new AsyncImagePainter$State$Error(fy9Var, ly4Var);
        }
    }
}
