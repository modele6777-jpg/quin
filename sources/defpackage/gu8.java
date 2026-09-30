package defpackage;

import android.view.View;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gu8 {
    public static final pr4 a = new pr4(1, new fk8(6));

    public static final void a(int i, dd2 dd2Var, l46 l46Var, j09 j09Var, String str) {
        int i2;
        dd2 dd2Var2;
        b1b b1bVar;
        ene eneVar;
        str.getClass();
        l46Var.h0(993527011);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(j09Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.i(dd2Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            Object obj = (iu8) l46Var.k(a);
            l46Var.d0(1296724400, str);
            Object objR = l46Var.R();
            Object obj2 = sf2.a;
            if (objR == obj2) {
                objR = new hu8();
                l46Var.p0(objR);
            }
            Object obj3 = (hu8) objR;
            b1b b1bVar2 = fne.b;
            ene eneVar2 = (ene) l46Var.k(b1bVar2);
            b1b b1bVar3 = fne.a;
            ene eneVar3 = (ene) l46Var.k(b1bVar3);
            boolean zG = l46Var.g(eneVar2) | l46Var.g(obj3);
            Object objR2 = l46Var.R();
            if (zG || objR2 == obj2) {
                if (eneVar2 != null) {
                    b1bVar = b1bVar3;
                    eneVar = eneVar3;
                    objR2 = new lf6(eneVar2, new sk3(0, obj3, hu8.class, "isToolbarValid", "isToolbarValid()Z", 0, 23));
                } else {
                    b1bVar = b1bVar3;
                    eneVar = eneVar3;
                    objR2 = null;
                }
                l46Var.p0(objR2);
            } else {
                b1bVar = b1bVar3;
                eneVar = eneVar3;
            }
            Object obj4 = (lf6) objR2;
            boolean zG2 = l46Var.g(eneVar) | l46Var.g(obj3);
            Object objR3 = l46Var.R();
            if (zG2 || objR3 == obj2) {
                Object lf6Var = eneVar != null ? new lf6(eneVar, new sk3(0, obj3, hu8.class, "isAttached", "isAttached()Z", 0, 22)) : null;
                l46Var.p0(lf6Var);
                objR3 = lf6Var;
            }
            Object obj5 = (lf6) objR3;
            boolean zG3 = l46Var.g(obj) | l46Var.i(obj3);
            Object objR4 = l46Var.R();
            if (zG3 || objR4 == obj2) {
                objR4 = new so5(28, obj, obj3);
                l46Var.p0(objR4);
            }
            af1.h(obj3, obj, (a26) objR4, l46Var);
            dd2Var2 = dd2Var;
            mh3.b(new e1b[]{b1bVar2.a(obj4), b1bVar.a(obj5)}, af1.b0(152304534, new m65(obj3, j09Var, dd2Var2, 14), l46Var), l46Var, 48);
            l46Var.r(false);
        } else {
            dd2Var2 = dd2Var;
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new px1(j09Var, str, dd2Var2, i);
        }
    }

    public static final void b(j09 j09Var, dd2 dd2Var, l46 l46Var, int i) {
        l46Var.h0(-1594074283);
        int i2 = i | 6;
        int i3 = 0;
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = new iu8();
                l46Var.p0(objR);
            }
            iu8 iu8Var = (iu8) objR;
            View view = (View) l46Var.k(uq.f);
            Object objR2 = l46Var.R();
            if (objR2 == i8cVar) {
                objR2 = q1c.f(null);
                l46Var.p0(objR2);
            }
            e89 e89Var = (e89) objR2;
            f48 f48Var = f48.ON_STOP;
            Object objR3 = l46Var.R();
            if (objR3 == i8cVar) {
                objR3 = new zv6(14, iu8Var);
                l46Var.p0(objR3);
            }
            t72.g(f48Var, null, (x16) objR3, l46Var, 390);
            mh3.a(a.a(iu8Var), af1.b0(-1525797227, new q8(iu8Var, view, e89Var, dd2Var), l46Var), l46Var, 56);
            j09Var = g09.a;
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new eu8(j09Var, dd2Var, i, i3);
        }
    }
}
