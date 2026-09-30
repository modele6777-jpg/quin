package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import tech.chatmind.api.credits.QuotaUsage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cs1 implements xj5, v26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cs1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        int i = this.a;
        wef wefVar = wef.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((a26) obj2).d((String) obj);
                break;
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                q06 q06Var = (q06) obj2;
                if (!q06Var.g) {
                    if (!zBooleanValue) {
                        q06Var.g = true;
                        q06Var.c.invoke();
                        q06Var.d.invoke();
                    } else if (!q06Var.e) {
                        q06Var.e = true;
                        q06Var.a.invoke();
                    }
                }
                break;
            case 2:
                int i2 = p3c.L0;
                ((p3c) obj2).r((String) obj);
                break;
            case 3:
                ((AtomicReference) obj2).set((g0d) obj);
                break;
            default:
                int i3 = mhf.a1;
                ((mhf) obj2).S((QuotaUsage) obj);
                break;
        }
        return wefVar;
    }

    @Override // defpackage.v26
    public final m26 b() {
        switch (this.a) {
            case 0:
                return new h36(2, 0, oa7.class, (a26) this.b, "suspendConversion0", "suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
            case 1:
                return new tf(2, 4, q06.class, (q06) this.b, "onSignInChanged", "onSignInChanged(Z)V");
            case 2:
                return new tf(2, 4, p3c.class, (p3c) this.b, "switchAccount", "switchAccount(Ljava/lang/String;)V");
            case 3:
                return new tf(2, 4, AtomicReference.class, (AtomicReference) this.b, "set", "set(Ljava/lang/Object;)V");
            default:
                return new tf(2, 4, mhf.class, (mhf) this.b, "updateUsage", "updateUsage(Ltech/chatmind/api/credits/QuotaUsage;)V");
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof xj5) && (obj instanceof v26)) {
                    return b().equals(((v26) obj).b());
                }
                return false;
            case 1:
                if ((obj instanceof xj5) && (obj instanceof v26)) {
                    return b().equals(((v26) obj).b());
                }
                return false;
            case 2:
                if ((obj instanceof xj5) && (obj instanceof v26)) {
                    return b().equals(((v26) obj).b());
                }
                return false;
            case 3:
                if ((obj instanceof xj5) && (obj instanceof v26)) {
                    return b().equals(((v26) obj).b());
                }
                return false;
            default:
                if ((obj instanceof xj5) && (obj instanceof v26)) {
                    return b().equals(((v26) obj).b());
                }
                return false;
        }
    }

    public final int hashCode() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return b().hashCode();
    }
}
