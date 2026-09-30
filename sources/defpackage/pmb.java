package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class pmb extends q72 {
    public final em7 b;
    public final zc0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pmb(em7 em7Var, xn7 xn7Var) {
        super(xn7Var);
        xn7Var.getClass();
        this.b = em7Var;
        nyc nycVarE = xn7Var.e();
        nycVarE.getClass();
        this.c = new zc0(nycVarE, 0);
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return this.c;
    }

    @Override // defpackage.e1
    public final Object f() {
        return new ArrayList();
    }

    @Override // defpackage.e1
    public final int g(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        return arrayList.size();
    }

    @Override // defpackage.e1
    public final Iterator h(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return new l2(objArr);
    }

    @Override // defpackage.e1
    public final int i(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return objArr.length;
    }

    @Override // defpackage.e1
    public final Object l(Object obj) {
        throw null;
    }

    @Override // defpackage.e1
    public final Object m(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        Object objNewInstance = Array.newInstance((Class<?>) af1.R(this.b), arrayList.size());
        objNewInstance.getClass();
        Object[] array = arrayList.toArray((Object[]) objNewInstance);
        array.getClass();
        return array;
    }

    @Override // defpackage.q72
    public final void n(int i, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        arrayList.add(i, obj2);
    }
}
