package defpackage;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class crf {
    public static final long a = ll2.b(0, 0, 0, 0, 5);
    public static final /* synthetic */ int b = 0;

    public static final ch0 a(l46 l46Var) {
        if (!((Boolean) l46Var.k(h57.a)).booleanValue()) {
            l46Var.f0(2019088453);
            l46Var.r(false);
            return null;
        }
        l46Var.f0(2019030948);
        ch0 ch0Var = (ch0) l46Var.k(ia8.a);
        l46Var.r(false);
        return ch0Var;
    }

    public static final hld b(bn2 bn2Var, l46 l46Var) {
        Object obj;
        Object obj2;
        boolean zT = pa7.t(bn2Var, an2.f);
        boolean zH = l46Var.h(zT);
        Object objR = l46Var.R();
        if (zH || objR == sf2.a) {
            if (zT) {
                obj = hld.S;
            } else {
                nl2 nl2Var = new nl2();
                nl2Var.a = a;
                nl2Var.b = new ArrayList();
                obj = nl2Var;
            }
            Object obj3 = obj;
            l46Var.p0(obj3);
            obj2 = obj3;
        }
        obj2 = objR;
        return (hld) obj2;
    }

    public static final sw6 c(Object obj, l46 l46Var) {
        l46Var.f0(1319639034);
        if (obj instanceof sw6) {
            l46Var.f0(1530875884);
            sw6 sw6Var = (sw6) obj;
            l46Var.r(false);
            l46Var.r(false);
            return sw6Var;
        }
        l46Var.f0(1530915130);
        Context context = (Context) l46Var.k(uq.b);
        boolean zG = l46Var.g(context) | l46Var.g(obj);
        Object objR = l46Var.R();
        if (zG || objR == sf2.a) {
            pw6 pw6Var = new pw6(context);
            pw6Var.c = obj;
            objR = pw6Var.a();
            l46Var.p0(objR);
        }
        sw6 sw6Var2 = (sw6) objR;
        l46Var.r(false);
        l46Var.r(false);
        return sw6Var2;
    }

    public static final long d(long j) {
        int iL = ym8.L(Float.intBitsToFloat((int) (j >> 32)));
        return (((long) ym8.L(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iL) << 32);
    }

    public static void e(String str) {
        throw new IllegalArgumentException(ub3.k("Unsupported type: ", str, ". ", ib8.j("If you wish to display this ", str, ", use androidx.compose.foundation.Image.")));
    }

    public static final void f(sw6 sw6Var) {
        Object obj = sw6Var.b;
        if (obj instanceof pw6) {
            qc0.j("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
            return;
        }
        if (obj instanceof cv6) {
            e("ImageBitmap");
            throw null;
        }
        if (obj instanceof gx6) {
            e("ImageVector");
            throw null;
        }
        if (obj instanceof fy9) {
            e("Painter");
            throw null;
        }
        if (sw6Var.c != null) {
            qc0.j("request.target must be null.");
        } else {
            if (((h48) b21.z(sw6Var, yw6.e)) == null) {
                return;
            }
            qc0.j("request.lifecycle must be null.");
        }
    }
}
