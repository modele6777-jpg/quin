package defpackage;

import ai.askquin.App;
import ai.askquin.ui.conversation.dialogue.NewReadingState;
import ai.askquin.ui.dev.MessageSelectionQaRoute;
import ai.askquin.ui.draw.mixed.MixedDeckSnapshot;
import ai.askquin.ui.main.MainTabRoute$Account;
import ai.askquin.ui.main.MainTabRoute$Explore;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import tech.chatmind.api.Message;
import tech.chatmind.api.annual.model.MonthlyContent;
import tech.chatmind.api.annual.model.MonthlyReportRequestBody;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fk8 implements x16 {
    public final /* synthetic */ int a;

    public /* synthetic */ fk8(int i) {
        this.a = i;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                return q1c.f(Boolean.FALSE);
            case 1:
                return MainTabRoute$Account._init_$_anonymous_();
            case 2:
                return MainTabRoute$Explore._init_$_anonymous_();
            case 3:
                return Boolean.FALSE;
            case 4:
                return s39.a;
            case 5:
                return Message._childSerializers$_anonymous_();
            case 6:
                return null;
            case 7:
                return MessageSelectionQaRoute._init_$_anonymous_();
            case 8:
                return MixedDeckSnapshot._childSerializers$_anonymous_();
            case 9:
                return MixedDeckSnapshot._childSerializers$_anonymous_$0();
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return UUID.randomUUID();
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                nyc[] nycVarArr = new nyc[0];
                if (v4e.Q("kotlinx.datetime.MonthBased")) {
                    qc0.j("Blank serial names are prohibited");
                    return null;
                }
                q22 q22Var = new q22("kotlinx.datetime.MonthBased");
                c77 c77Var = c77.a;
                q22Var.a("months", c77.b, false);
                return new pyc("kotlinx.datetime.MonthBased", g5e.c, q22Var.c.size(), qd0.G0(nycVarArr), q22Var);
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return MonthlyContent._childSerializers$_anonymous_();
            case 14:
                return new sz9(0);
            case 15:
                return MonthlyReportRequestBody._childSerializers$_anonymous_();
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return new ldc();
            case 17:
                oz1 oz1Var = new oz1(1);
                oz1Var.b(job.a.b(ea9.class), new d59(3));
                return oz1Var.c();
            case 18:
                qn2 qn2VarK = jgb.k(nu4.a);
                jgb.I(qn2VarK, null);
                return qn2VarK;
            case 19:
                return p81.a;
            case 20:
                return dbf.a;
            case 21:
                return NewReadingState._init_$_anonymous_();
            case 22:
                App app = di9.c;
                if (app != null) {
                    return new r6a(new kb6(app), new fk8(23), new gl(2, di9.a, di9.class, "trackResult", "trackResult(Lai/askquin/notification/PendingPermissionResult;Z)V", 0, 24));
                }
                pa7.g0("application");
                throw null;
            case 23:
                AtomicReference atomicReference = xh9.a;
                App app2 = di9.c;
                if (app2 != null) {
                    return Boolean.valueOf(xh9.d(app2) == wh9.Authorized);
                }
                pa7.g0("application");
                throw null;
            case 24:
                return q1c.f(Boolean.TRUE);
            case 25:
                return q1c.f(Boolean.FALSE);
            case 26:
                return new g83(null);
            case 27:
            case 28:
                return wefVar;
            default:
                return q1c.f(Boolean.FALSE);
        }
    }
}
