package defpackage;

import ai.askquin.ui.fourseasons.FourSeasonsEntry;
import ai.askquin.ui.router.AppRoute;
import java.time.LocalDateTime;
import java.time.ZoneId;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xic extends gbe implements l26 {
    final /* synthetic */ vb2 $activity;
    final /* synthetic */ q7b $app;
    final /* synthetic */ yic $campaign;
    final /* synthetic */ rw5 $fourSeasonsRepository;
    final /* synthetic */ dc9 $navigation;
    final /* synthetic */ csc $navigationGuard;
    final /* synthetic */ boolean $open;
    final /* synthetic */ mma $popups;
    final /* synthetic */ e89 $routed$delegate;
    final /* synthetic */ qna $update;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xic(csc cscVar, q7b q7bVar, qna qnaVar, boolean z, vb2 vb2Var, dc9 dc9Var, mma mmaVar, yic yicVar, e89 e89Var, rw5 rw5Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$navigationGuard = cscVar;
        this.$app = q7bVar;
        this.$update = qnaVar;
        this.$open = z;
        this.$activity = vb2Var;
        this.$navigation = dc9Var;
        this.$popups = mmaVar;
        this.$campaign = yicVar;
        this.$routed$delegate = e89Var;
        this.$fourSeasonsRepository = rw5Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        xic xicVar = new xic(this.$navigationGuard, this.$app, this.$update, this.$open, this.$activity, this.$navigation, this.$popups, this.$campaign, this.$routed$delegate, this.$fourSeasonsRepository, xn2Var);
        xicVar.L$0 = obj;
        return xicVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object dzbVar;
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                csc cscVar = this.$navigationGuard;
                ua9 ua9VarI = this.$app.a.b.i();
                if (!(this.$update.h() && this.$update.i() == null)) {
                    cscVar.getClass();
                } else if (!cscVar.a && ua9VarI != null) {
                    int i2 = ua9.e;
                    if (kj0.k0(ua9VarI, job.a.b(AppRoute.Main.class)) && this.$open && !((Boolean) this.$routed$delegate.getValue()).booleanValue() && !((Boolean) dsc.b.getValue()).booleanValue()) {
                        vb2 vb2Var = this.$activity;
                        if (!dsc.a(vb2Var != null ? vb2Var.getIntent() : null)) {
                            Long l = g3b.a;
                            ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
                            zoneIdSystemDefault.getClass();
                            LocalDateTime localDateTimeA = g3b.a(zoneIdSystemDefault);
                            dc9 dc9Var = this.$navigation;
                            mma mmaVar = this.$popups;
                            dc9Var.getClass();
                            mmaVar.getClass();
                            if (((Boolean) dc9Var.y.getValue()).booleanValue() && !cr0.b(localDateTimeA)) {
                                arb.f(dc9Var, mmaVar, true);
                                return wefVar;
                            }
                            rw5 rw5Var = this.$fourSeasonsRepository;
                            yic yicVar = this.$campaign;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 1;
                            rw5Var.getClass();
                            obj = pa7.t("auto_open", "auto_open") ? rs0.R(15000L, new nw5(rw5Var, yicVar, null), this) : rw5Var.b(yicVar, this);
                            if (obj == bw2Var) {
                                return bw2Var;
                            }
                        }
                    }
                    return wefVar;
                }
                return wefVar;
            }
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
            dzbVar = (ax5) obj;
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        dc9 dc9Var2 = this.$navigation;
        mma mmaVar2 = this.$popups;
        Throwable thA = ezb.a(dzbVar);
        if (thA != null) {
            hf8.Q.getClass();
            ef8.a("SeasonalStartup").c("Failed to check automatic entry eligibility", thA);
            arb.f(dc9Var2, mmaVar2, true);
            return wefVar;
        }
        ax5 ax5Var = (ax5) dzbVar;
        ax5Var.getClass();
        if (ax5Var != ax5.a) {
            arb.f(this.$navigation, this.$popups, true);
            return wefVar;
        }
        csc cscVar2 = this.$navigationGuard;
        ua9 ua9VarI2 = this.$app.a.b.i();
        if (!(this.$update.h() && this.$update.i() == null)) {
            cscVar2.getClass();
        } else if (!cscVar2.a && ua9VarI2 != null) {
            int i3 = ua9.e;
            if (kj0.k0(ua9VarI2, job.a.b(AppRoute.Main.class)) && !((Boolean) dsc.b.getValue()).booleanValue()) {
                vb2 vb2Var2 = this.$activity;
                if (!dsc.a(vb2Var2 != null ? vb2Var2.getIntent() : null)) {
                    this.$routed$delegate.setValue(Boolean.TRUE);
                    this.$navigation.y.setValue(Boolean.FALSE);
                    cb9 cb9Var = this.$app.a;
                    yic yicVar2 = this.$campaign;
                    ka9.e(cb9Var, new FourSeasonsEntry(yicVar2.a, yicVar2.b.getWireValue(), "auto_open"), null, 6);
                    return wefVar;
                }
            }
        }
        arb.f(this.$navigation, this.$popups, false);
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((xic) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
