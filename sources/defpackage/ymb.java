package defpackage;

import android.graphics.Bitmap;
import android.view.KeyEvent;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ymb implements a26 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ ymb(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x019e  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b8  */
    @Override // defpackage.a26
    public final Object d(Object obj) {
        boolean zEquals;
        i8f i8fVarM;
        int i = this.a;
        boolean z = false;
        int i2 = 1;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                enb enbVar = (enb) this.b;
                Method method = (Method) obj;
                if (!method.isSynthetic()) {
                    if (enbVar.a.isEnum()) {
                        String name = method.getName();
                        if (pa7.t(name, "values")) {
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            parameterTypes.getClass();
                            if (parameterTypes.length == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (pa7.t(name, "valueOf")) {
                            zEquals = Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
                        } else {
                            zEquals = false;
                        }
                        if (!zEquals) {
                            z = true;
                        }
                    } else {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 1:
                sn4 sn4Var = (sn4) obj;
                sn4Var.getClass();
                sn4.A(sn4Var, new ks((Bitmap) this.b), 0L, 0.0f, null, 0, 62);
                return wefVar;
            case 2:
                sn4 sn4Var2 = (sn4) obj;
                sn4Var2.getClass();
                i7h.r(sn4Var2, (ke6) this.b);
                return wefVar;
            case 3:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                via viaVar = (via) this.b;
                if (viaVar != null) {
                    viaVar.c = zBooleanValue;
                }
                return wefVar;
            case 4:
                KeyEvent keyEvent = ((mo7) obj).a;
                fwc fwcVar = (fwc) this.b;
                if (to7.a.h(keyEvent) == lo7.G0) {
                    fwcVar.e();
                    z = true;
                }
                return Boolean.valueOf(z);
            case 5:
                xrf xrfVar = (xrf) this.b;
                ea1 ea1Var = (ea1) obj;
                ea1Var.getClass();
                tt7 type = ((xrf) ea1Var.G().get(xrfVar.g)).getType();
                type.getClass();
                return type;
            case 6:
                Throwable th = (Throwable) obj;
                mbe mbeVar = (mbe) this.b;
                pl1 pl1Var = mbeVar.c;
                if (pl1Var != null) {
                    pl1Var.p(th);
                }
                mbeVar.c = null;
                return wefVar;
            case 7:
                float[] fArr = ((zm8) obj).a;
                bv7 bv7Var = (bv7) this.b;
                if (bv7Var.h()) {
                    vd0.S(bv7Var).k(bv7Var, fArr);
                }
                return wefVar;
            case 8:
                vea veaVar = (vea) this.b;
                h8f h8fVar = (h8f) obj;
                c8f c8fVar = h8fVar.a;
                tf7 tf7Var = h8fVar.b;
                Set set = tf7Var.e;
                if (set != null && set.contains(c8fVar.a())) {
                    return veaVar.t(tf7Var);
                }
                tjd tjdVarS = c8fVar.S();
                tjdVarS.getClass();
                LinkedHashSet<c8f> linkedHashSet = new LinkedHashSet();
                o7c.o(tjdVarS, tjdVarS, linkedHashSet, set);
                int iF = bm8.F(t72.u(linkedHashSet, 10));
                if (iF < 16) {
                    iF = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iF);
                for (c8f c8fVar2 : linkedHashSet) {
                    if (set == null || !set.contains(c8fVar2)) {
                        Set set2 = tf7Var.e;
                        i8fVarM = jy4.m(c8fVar2, tf7Var, veaVar, veaVar.u(c8fVar2, tf7.a(tf7Var, null, false, set2 != null ? n3d.n(set2, c8fVar) : n3d.p(c8fVar), null, 47)));
                    } else {
                        i8fVarM = w8f.l(c8fVar2, tf7Var);
                    }
                    iy9 iy9Var = new iy9(c8fVar2.h(), i8fVarM);
                    linkedHashMap.put(iy9Var.d(), iy9Var.e());
                }
                q8f q8fVar = new q8f(new ezd(i2, linkedHashMap));
                List upperBounds = c8fVar.getUpperBounds();
                upperBounds.getClass();
                o1d o1dVarC = veaVar.C(q8fVar, upperBounds, tf7Var);
                if (o1dVarC.isEmpty()) {
                    return veaVar.t(tf7Var);
                }
                if (o1dVarC.c() == 1) {
                    return (tt7) s72.W0(o1dVarC);
                }
                qc0.j("Should only be one computed upper bound if no need to intersect all bounds");
                return null;
            default:
                tt7 tt7Var = (tt7) this.b;
                ((w09) obj).getClass();
                return tt7Var;
        }
    }
}
