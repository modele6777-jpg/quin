package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class xnb implements wnb {
    public final dm7 a;
    public final fob b;

    public xnb(dm7 dm7Var) {
        dm7Var.getClass();
        this.a = dm7Var;
        this.b = lmg.m0(null, new yv9(0, this, ynb.class, "computeAbsentArguments", "computeAbsentArguments(Lkotlin/reflect/jvm/internal/ReflectKCallable;)[Ljava/lang/Object;", 1, 6));
    }

    @Override // defpackage.wnb
    public List a() {
        return getParameters();
    }

    @Override // defpackage.cm7
    public final Object call(Object... objArr) throws xu6 {
        objArr.getClass();
        try {
            return h().call(objArr);
        } catch (IllegalAccessException e) {
            throw new xu6(e);
        }
    }

    @Override // defpackage.cm7
    public final Object callBy(Map map) throws xu6 {
        Object objG;
        map.getClass();
        boolean z = false;
        if (ynb.P(this)) {
            List<aob> parameters = getParameters();
            ArrayList arrayList = new ArrayList(t72.u(parameters, 10));
            for (aob aobVar : parameters) {
                if (map.containsKey(aobVar)) {
                    objG = map.get(aobVar);
                    if (objG == null) {
                        cva.g(41, aobVar, "Annotation argument value cannot be null (");
                        return null;
                    }
                } else if (aobVar.w()) {
                    objG = null;
                } else {
                    if (!aobVar.y()) {
                        yg5.l(aobVar, "No argument provided for a required parameter: ");
                        return null;
                    }
                    objG = ynb.G(aobVar.u());
                }
                arrayList.add(objG);
            }
            sa1 sa1VarN = n();
            if (sa1VarN == null) {
                ho7.m(this, "This callable does not support a default call: ");
                return null;
            }
            try {
                return sa1VarN.call(arrayList.toArray(new Object[0]));
            } catch (IllegalAccessException e) {
                throw new xu6(e);
            }
        }
        List<aob> parameters2 = getParameters();
        if (parameters2.isEmpty()) {
            try {
                return h().call(isSuspend() ? new xn2[]{null} : new xn2[0]);
            } catch (IllegalAccessException e2) {
                throw new xu6(e2);
            }
        }
        int size = (isSuspend() ? 1 : 0) + parameters2.size();
        Object[] objArr = (Object[]) ((Object[]) this.b.invoke()).clone();
        if (isSuspend()) {
            objArr[parameters2.size()] = null;
        }
        int i = 0;
        for (aob aobVar2 : parameters2) {
            if (map.containsKey(aobVar2)) {
                objArr[aobVar2.m()] = map.get(aobVar2);
            } else if (aobVar2.w()) {
                int i2 = (i / 32) + size;
                Object obj = objArr[i2];
                obj.getClass();
                objArr[i2] = Integer.valueOf(((Integer) obj).intValue() | (1 << (i % 32)));
                z = true;
            } else if (!aobVar2.y()) {
                yg5.l(aobVar2, "No argument provided for a required parameter: ");
                return null;
            }
            if (aobVar2.t() == on7.d || aobVar2.t() == on7.b) {
                i++;
            }
        }
        if (!z) {
            try {
                return h().call(Arrays.copyOf(objArr, size));
            } catch (IllegalAccessException e3) {
                throw new xu6(e3);
            }
        }
        sa1 sa1VarN2 = n();
        if (sa1VarN2 == null) {
            ho7.m(this, "This callable does not support a default call: ");
            return null;
        }
        try {
            return sa1VarN2.call(objArr);
        } catch (IllegalAccessException e4) {
            throw new xu6(e4);
        }
    }

    @Override // defpackage.cm7
    public final boolean isAbstract() {
        return i() == d09.ABSTRACT;
    }

    @Override // defpackage.cm7
    public final boolean isFinal() {
        return i() == d09.FINAL;
    }

    @Override // defpackage.cm7
    public final boolean isOpen() {
        return i() == d09.OPEN;
    }
}
