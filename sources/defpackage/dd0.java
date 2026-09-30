package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class dd0 extends q72 {
    public final /* synthetic */ int b;
    public final y78 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dd0(xn7 xn7Var, int i) {
        super(xn7Var);
        this.b = i;
        xn7Var.getClass();
        switch (i) {
            case 1:
                super(xn7Var);
                nyc nycVarE = xn7Var.e();
                nycVarE.getClass();
                this.c = new zc0(nycVarE, 2);
                break;
            case 2:
                super(xn7Var);
                nyc nycVarE2 = xn7Var.e();
                nycVarE2.getClass();
                this.c = new zc0(nycVarE2, 3);
                break;
            default:
                nyc nycVarE3 = xn7Var.e();
                nycVarE3.getClass();
                this.c = new zc0(nycVarE3, 1);
                break;
        }
    }

    @Override // defpackage.xn7
    public final nyc e() {
        int i = this.b;
        y78 y78Var = this.c;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
        }
        return (zc0) y78Var;
    }

    @Override // defpackage.e1
    public final Object f() {
        switch (this.b) {
            case 0:
                return new ArrayList();
            case 1:
                return new HashSet();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // defpackage.e1
    public final int g(Object obj) {
        switch (this.b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                return arrayList.size();
            case 1:
                HashSet hashSet = (HashSet) obj;
                hashSet.getClass();
                return hashSet.size();
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                return linkedHashSet.size();
        }
    }

    @Override // defpackage.e1
    public final Iterator h(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.iterator();
    }

    @Override // defpackage.e1
    public final int i(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.size();
    }

    @Override // defpackage.e1
    public final Object l(Object obj) {
        switch (this.b) {
            case 0:
                throw null;
            case 1:
                throw null;
            default:
                throw null;
        }
    }

    @Override // defpackage.e1
    public final Object m(Object obj) {
        switch (this.b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                return arrayList;
            case 1:
                HashSet hashSet = (HashSet) obj;
                hashSet.getClass();
                return hashSet;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                return linkedHashSet;
        }
    }

    @Override // defpackage.q72
    public final void n(int i, Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                arrayList.add(i, obj2);
                break;
            case 1:
                HashSet hashSet = (HashSet) obj;
                hashSet.getClass();
                hashSet.add(obj2);
                break;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                linkedHashSet.add(obj2);
                break;
        }
    }
}
