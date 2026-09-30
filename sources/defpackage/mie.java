package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import tech.chatmind.api.TarotExperienceLevel;
import tech.chatmind.api.TarotOrderErrorData;
import tech.chatmind.api.TarotReadingBody;
import tech.chatmind.api.TarotReadingChatState;
import tech.chatmind.api.TarotReadingHistory;
import tech.chatmind.api.TarotReadingMessagesResponse;
import tech.chatmind.api.TarotReadingQuestionHistory;
import tech.chatmind.api.TarotReadingSpreadHistory;
import tech.chatmind.api.TemplateCategory;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mie implements x16 {
    public final /* synthetic */ int a;

    public /* synthetic */ mie(int i) {
        this.a = i;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return TarotExperienceLevel._init_$_anonymous_();
            case 1:
                return TarotOrderErrorData._childSerializers$_anonymous_();
            case 2:
                return TarotReadingBody._childSerializers$_anonymous_();
            case 3:
                return TarotReadingChatState._childSerializers$_anonymous_();
            case 4:
                return TarotReadingHistory._childSerializers$_anonymous_();
            case 5:
                return TarotReadingMessagesResponse._childSerializers$_anonymous_();
            case 6:
                return TarotReadingQuestionHistory._childSerializers$_anonymous_();
            case 7:
                return TarotReadingSpreadHistory._childSerializers$_anonymous_();
            case 8:
                return TarotSkinIdentify._init_$_anonymous_();
            case 9:
                return TemplateCategory._init_$_anonymous_();
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return null;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return t9f.a;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return new w67(0L);
            case 14:
                return new w67(0L);
            case 15:
                return mt3.a;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                nyc[] nycVarArr = new nyc[0];
                if (v4e.Q("kotlinx.datetime.TimeBased")) {
                    qc0.j("Blank serial names are prohibited");
                    return null;
                }
                q22 q22Var = new q22("kotlinx.datetime.TimeBased");
                eg8 eg8Var = eg8.a;
                q22Var.a("nanoseconds", eg8.b, false);
                return new pyc("kotlinx.datetime.TimeBased", g5e.c, q22Var.c.size(), qd0.G0(nycVarArr), q22Var);
            case 17:
                return eze.a;
            case 18:
                x1f x1fVar = x1f.a;
                return (o05) ((nfc) lr7.j().c.e).g(job.a.b(o05.class), null, new o4e("mixpanel"));
            case 19:
                x1f x1fVar2 = x1f.a;
                return (o05) ((nfc) lr7.j().c.e).g(job.a.b(o05.class), null, new o4e("firebase"));
            case 20:
                x1f x1fVar3 = x1f.a;
                return (o05) ((nfc) lr7.j().c.e).d(job.a.b(o05.class), new o4e("adjust"));
            case 21:
                x1f x1fVar4 = x1f.a;
                return qd0.k0(new o05[]{x1f.b(), x1f.a(), (o05) x1f.f.getValue()});
            case 22:
                mue mueVar = s9f.d;
                mue mueVar2 = s9f.e;
                mue mueVar3 = s9f.f;
                mue mueVar4 = s9f.g;
                mue mueVar5 = s9f.h;
                mue mueVar6 = s9f.i;
                mue mueVar7 = s9f.m;
                mue mueVar8 = s9f.n;
                mue mueVar9 = s9f.o;
                mue mueVar10 = s9f.a;
                mue mueVar11 = s9f.b;
                mue mueVar12 = s9f.c;
                mue mueVar13 = s9f.j;
                mue mueVar14 = s9f.k;
                mue mueVar15 = s9f.l;
                return new p9f(mueVar, mueVar2, mueVar3, mueVar4, mueVar5, mueVar6, mueVar7, mueVar8, mueVar9, mueVar10, mueVar11, mueVar12, mueVar13, mueVar14, mueVar15, mueVar, mueVar2, mueVar3, mueVar4, mueVar5, mueVar6, mueVar7, mueVar8, mueVar9, mueVar10, mueVar11, mueVar12, mueVar13, mueVar14, mueVar15);
            case 23:
                return q1c.f(Boolean.FALSE);
            case 24:
                return wef.a;
            case 25:
                return q1c.f(Boolean.FALSE);
            case 26:
                ca2.a.getClass();
                return q1c.f(Boolean.valueOf(ca2.c));
            case 27:
                return q1c.f(Boolean.FALSE);
            case 28:
                return q1c.f(Boolean.TRUE);
            default:
                return new chf(false);
        }
    }
}
