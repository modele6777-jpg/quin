package defpackage;

import java.time.ZoneId;
import java.util.concurrent.CancellationException;
import tech.chatmind.api.credits.GuestPassPendingGrant;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cma extends gbe implements l26 {
    final /* synthetic */ String $accountId;
    final /* synthetic */ GuestPassPendingGrant $grant;
    final /* synthetic */ pua $popup;
    final /* synthetic */ h06 $reservation;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ mma this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cma(mma mmaVar, String str, h06 h06Var, pua puaVar, GuestPassPendingGrant guestPassPendingGrant, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = mmaVar;
        this.$accountId = str;
        this.$reservation = h06Var;
        this.$popup = puaVar;
        this.$grant = guestPassPendingGrant;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new cma(this.this$0, this.$accountId, this.$reservation, this.$popup, this.$grant, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0078  */
    /* JADX WARN: Code duplicated, block: B:32:0x007a  */
    /* JADX WARN: Code duplicated, block: B:36:0x008d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0090  */
    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        mma mmaVar;
        h06 h06Var;
        h06 h06Var2;
        String str;
        bw2 bw2Var = bw2.a;
        int i = this.label;
        boolean z = true;
        try {
            if (i == 0) {
                jzb.q(obj);
                m06 m06Var = this.this$0.Z;
                String str2 = this.$accountId;
                this.label = 1;
                if (((iqa) m06Var).b(str2, this) == bw2Var) {
                }
                return bw2Var;
            }
            if (i == 1) {
                jzb.q(obj);
            } else {
                if (i != 2) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                h06Var2 = (h06) this.L$1;
                mmaVar = (mma) this.L$0;
                jzb.q(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                h06Var = h06Var2;
            } else {
                h06Var = h06Var2;
                z = false;
            }
            ZoneId zoneId = mma.u1;
            mmaVar.g(h06Var, z);
            m8b m8bVarD = this.this$0.d();
            if (this.$popup.f != null) {
                str = "balance_notice";
            } else {
                str = "pending_grant";
            }
            m8bVarD.e("Friend-coupon notice exposed (source=" + str + ", count=" + this.$grant.getCount() + ")");
            return wef.a;
            mmaVar = this.this$0;
            h06Var = this.$reservation;
            if (this.$popup.f == null) {
                ZoneId zoneId2 = mma.u1;
                if (pa7.t(jrb.d(mmaVar.v), this.$accountId)) {
                    sf6 sf6Var = this.this$0.X;
                    GuestPassPendingGrant guestPassPendingGrant = this.$grant;
                    this.L$0 = mmaVar;
                    this.L$1 = h06Var;
                    this.label = 2;
                    Object objA = ((wqa) sf6Var).a(guestPassPendingGrant, this);
                    if (objA != bw2Var) {
                        h06Var2 = h06Var;
                        obj = objA;
                        if (((Boolean) obj).booleanValue()) {
                            h06Var = h06Var2;
                        } else {
                            h06Var = h06Var2;
                            z = false;
                        }
                    }
                    return bw2Var;
                }
                z = false;
            }
            ZoneId zoneId3 = mma.u1;
            mmaVar.g(h06Var, z);
            m8b m8bVarD2 = this.this$0.d();
            if (this.$popup.f != null) {
                str = "balance_notice";
            } else {
                str = "pending_grant";
            }
            m8bVarD2.e("Friend-coupon notice exposed (source=" + str + ", count=" + this.$grant.getCount() + ")");
        } catch (CancellationException e) {
            mma mmaVar2 = this.this$0;
            h06 h06Var3 = this.$reservation;
            ZoneId zoneId4 = mma.u1;
            synchronized (mmaVar2.S0) {
                if (mmaVar2.s1 == h06Var3) {
                    mmaVar2.s1 = null;
                }
                throw e;
            }
        } catch (Exception e2) {
            this.this$0.d().c("Failed to consume pending friend-coupon grant", e2);
            mma mmaVar3 = this.this$0;
            h06 h06Var4 = this.$reservation;
            synchronized (mmaVar3.S0) {
                if (mmaVar3.s1 == h06Var4) {
                    mmaVar3.s1 = null;
                }
            }
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((cma) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
