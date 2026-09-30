package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hnb extends snb {
    public final Type a;
    public final xd7 b;

    public hnb(Type type) {
        xd7 enbVar;
        type.getClass();
        this.a = type;
        if (type instanceof Class) {
            enbVar = new enb((Class) type);
        } else if (type instanceof TypeVariable) {
            enbVar = new tnb((TypeVariable) type);
        } else {
            if (!(type instanceof ParameterizedType)) {
                cva.n("Not a classifier type (", type.getClass(), "): ", type);
                throw null;
            }
            Type rawType = ((ParameterizedType) type).getRawType();
            rawType.getClass();
            enbVar = new enb((Class) rawType);
        }
        this.b = enbVar;
    }

    @Override // defpackage.snb, defpackage.td7
    public final tmb a(dx5 dx5Var) {
        dx5Var.getClass();
        return null;
    }

    @Override // defpackage.snb
    public final Type b() {
        return this.a;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0037  */
    /* JADX WARN: Code duplicated, block: B:21:0x005a  */
    public final ArrayList c() {
        td7 xmbVar;
        td7 qnbVar;
        List<Type> listC = smb.c(this.a);
        ArrayList arrayList = new ArrayList(t72.u(listC, 10));
        for (Type type : listC) {
            type.getClass();
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    qnbVar = new qnb(cls);
                } else {
                    if (!(type instanceof GenericArrayType) || (z && ((Class) type).isArray())) {
                        xmbVar = new xmb(type);
                    } else {
                        xmbVar = type instanceof WildcardType ? new vnb((WildcardType) type) : new hnb(type);
                    }
                    qnbVar = xmbVar;
                }
            } else {
                if (type instanceof GenericArrayType) {
                    xmbVar = new xmb(type);
                } else {
                    xmbVar = new xmb(type);
                }
                qnbVar = xmbVar;
            }
            arrayList.add(qnbVar);
        }
        return arrayList;
    }

    public final boolean d() {
        Type type = this.a;
        if (type instanceof Class) {
            TypeVariable[] typeParameters = ((Class) type).getTypeParameters();
            typeParameters.getClass();
            if (!(typeParameters.length == 0)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.td7
    public final Collection getAnnotations() {
        return pu4.a;
    }
}
