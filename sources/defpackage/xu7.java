package defpackage;

import java.util.List;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xu7 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ int v;

    public /* synthetic */ xu7(TarotCardChoice tarotCardChoice, float f, a26 a26Var, float f2, mue mueVar, y72 y72Var, int i) {
        this.a = 2;
        this.b = tarotCardChoice;
        this.e = f;
        this.d = a26Var;
        this.f = f2;
        this.c = mueVar;
        this.g = y72Var;
        this.v = i;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) throws Throwable {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.v;
        Object obj3 = this.g;
        Object obj4 = this.c;
        Object obj5 = this.d;
        Object obj6 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = k99.P(i2 | 1);
                tq.e((List) obj6, (jie) obj4, (List) obj5, this.e, this.f, (fy9) obj3, (l46) obj, iP);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP2 = k99.P(i2 | 1);
                tq.e((List) obj6, (jie) obj4, (List) obj5, this.e, this.f, (fy9) obj3, (l46) obj, iP2);
                break;
            default:
                ((Integer) obj2).intValue();
                int iP3 = k99.P(i2 | 1);
                beb.g((TarotCardChoice) obj6, this.e, (a26) obj5, this.f, (mue) obj4, (y72) obj3, (l46) obj, iP3);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ xu7(List list, jie jieVar, List list2, float f, float f2, fy9 fy9Var, int i, int i2) {
        this.a = i2;
        this.b = list;
        this.c = jieVar;
        this.d = list2;
        this.e = f;
        this.f = f2;
        this.g = fy9Var;
        this.v = i;
    }
}
