package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import net.xmind.donut.gp.ProductDetailsBatchQueryKt;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class et5 implements l26 {
    public final /* synthetic */ m26 X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ m26 f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ m26 x;
    public final /* synthetic */ m26 y;
    public final /* synthetic */ m26 z;

    public /* synthetic */ et5(jt3 jt3Var, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, jc6 jc6Var, ArrayList arrayList, int i, ArrayList arrayList2, c78 c78Var, it3 it3Var, o14 o14Var, jc6 jc6Var2, oz5 oz5Var, oz5 oz5Var2) {
        this.c = jt3Var;
        this.d = atomicBoolean;
        this.e = atomicBoolean2;
        this.f = jc6Var;
        this.g = arrayList;
        this.b = i;
        this.v = arrayList2;
        this.w = c78Var;
        this.x = it3Var;
        this.y = o14Var;
        this.z = jc6Var2;
        this.X = oz5Var;
        this.Y = oz5Var2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        Object obj3 = this.Y;
        m26 m26Var = this.X;
        m26 m26Var2 = this.z;
        m26 m26Var3 = this.y;
        m26 m26Var4 = this.x;
        Object obj4 = this.w;
        Object obj5 = this.v;
        int i2 = this.b;
        Object obj6 = this.g;
        m26 m26Var5 = this.f;
        Object obj7 = this.e;
        Object obj8 = this.d;
        Object obj9 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                kj0.n((mic) obj9, (ju5) obj8, (a26) obj7, (x16) m26Var5, (x16) obj6, (x16) obj5, (x16) obj4, (x16) m26Var4, (x16) m26Var3, (x16) m26Var2, (x16) m26Var, (j09) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            default:
                jt3 jt3Var = (jt3) obj9;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj8;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) obj7;
                jc6 jc6Var = (jc6) m26Var5;
                ArrayList arrayList = (ArrayList) obj6;
                ArrayList arrayList2 = (ArrayList) obj5;
                c78 c78Var = (c78) obj4;
                it3 it3Var = (it3) m26Var4;
                o14 o14Var = (o14) m26Var3;
                jc6 jc6Var2 = (jc6) m26Var2;
                oz5 oz5Var = (oz5) m26Var;
                oz5 oz5Var2 = (oz5) obj3;
                tx0 tx0Var = (tx0) obj;
                List list = (List) obj2;
                tx0Var.getClass();
                list.getClass();
                if (((Boolean) jt3Var.invoke()).booleanValue() && !atomicBoolean.get() && atomicBoolean2.compareAndSet(false, true)) {
                    if (tx0Var.a == 0) {
                        x72.g0(arrayList, list);
                        ProductDetailsBatchQueryKt.a(jt3Var, arrayList2, atomicBoolean, c78Var, it3Var, arrayList, o14Var, jc6Var2, oz5Var, oz5Var2, jc6Var, i2 + 1);
                    } else if (atomicBoolean.compareAndSet(false, true) && ((Boolean) jt3Var.invoke()).booleanValue()) {
                        jc6Var.d(tx0Var);
                    }
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ et5(mic micVar, ju5 ju5Var, a26 a26Var, x16 x16Var, x16 x16Var2, x16 x16Var3, x16 x16Var4, x16 x16Var5, x16 x16Var6, x16 x16Var7, x16 x16Var8, j09 j09Var, int i) {
        this.c = micVar;
        this.d = ju5Var;
        this.e = a26Var;
        this.f = x16Var;
        this.g = x16Var2;
        this.v = x16Var3;
        this.w = x16Var4;
        this.x = x16Var5;
        this.y = x16Var6;
        this.z = x16Var7;
        this.X = x16Var8;
        this.Y = j09Var;
        this.b = i;
    }
}
