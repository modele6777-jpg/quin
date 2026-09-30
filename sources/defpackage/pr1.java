package defpackage;

import coil3.compose.AsyncImagePainter$State$Error;
import coil3.compose.AsyncImagePainter$State$Success;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pr1 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s69 b;

    public /* synthetic */ pr1(s69 s69Var, int i) {
        this.a = i;
        this.b = s69Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        s69 s69Var = this.b;
        switch (i) {
            case 0:
                ((sz9) s69Var).k(((Integer) obj).intValue());
                break;
            case 1:
                ((sz9) s69Var).k((int) (((e77) obj).a & 4294967295L));
                break;
            case 2:
                ((sz9) s69Var).k((int) (((e77) obj).a & 4294967295L));
                break;
            case 3:
                ((sz9) s69Var).k(((Integer) obj).intValue());
                break;
            case 4:
                ((sz9) s69Var).k(((Integer) obj).intValue());
                break;
            case 5:
                ((sz9) s69Var).k((int) (((e77) obj).a & 4294967295L));
                break;
            case 6:
                ((sz9) s69Var).k(((Integer) obj).intValue());
                break;
            case 7:
                ((sz9) s69Var).k((int) (((e77) obj).a & 4294967295L));
                break;
            case 8:
                yg0 yg0Var = (yg0) obj;
                yg0Var.getClass();
                if (yg0Var instanceof AsyncImagePainter$State$Success) {
                    sz9 sz9Var = (sz9) s69Var;
                    sz9Var.k(sz9Var.j() + 1);
                }
                break;
            case 9:
                ((sz9) s69Var).k((int) (((e77) obj).a & 4294967295L));
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ((sz9) s69Var).k((int) (((e77) obj).a & 4294967295L));
                break;
            default:
                yg0 yg0Var2 = (yg0) obj;
                yg0Var2.getClass();
                if ((yg0Var2 instanceof AsyncImagePainter$State$Success) || (yg0Var2 instanceof AsyncImagePainter$State$Error)) {
                    sz9 sz9Var2 = (sz9) s69Var;
                    sz9Var2.k(sz9Var2.j() + 1);
                }
                break;
        }
        return wefVar;
    }
}
