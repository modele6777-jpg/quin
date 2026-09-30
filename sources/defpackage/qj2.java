package defpackage;

import ai.askquin.ui.conversation.Operation;
import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.feedback.FeedbackUiState;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import tech.chatmind.api.SpreadRecommendationResult;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qj2 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r0 b;

    public /* synthetic */ qj2(r0 r0Var, int i) {
        this.a = i;
        this.b = r0Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        String str;
        String str2;
        int i = this.a;
        p05 p05Var = p05.a;
        int i2 = 2;
        wef wefVar = wef.a;
        r0 r0Var = this.b;
        switch (i) {
            case 0:
                jsd jsdVar = r0Var.R0;
                ArrayList arrayList = new ArrayList();
                Iterator it = jsdVar.iterator();
                while (true) {
                    ql6 ql6Var = (ql6) it;
                    if (!ql6Var.hasNext()) {
                        ct8 ct8Var = (ct8) s72.H0(arrayList);
                        return (ct8Var == null || (str = ct8Var.a) == null) ? "" : str;
                    }
                    Object next = ql6Var.next();
                    if (next instanceof ct8) {
                        arrayList.add(next);
                    }
                }
                break;
            case 1:
                FeedbackUiState feedbackUiState = FeedbackUiState.NONE;
                r0Var.getClass();
                feedbackUiState.getClass();
                r0Var.i2.setValue(feedbackUiState);
                return wefVar;
            case 2:
                FeedbackUiState feedbackUiState2 = FeedbackUiState.NONE;
                r0Var.getClass();
                feedbackUiState2.getClass();
                r0Var.i2.setValue(feedbackUiState2);
                return wefVar;
            case 3:
                r0Var.getClass();
                x1f x1fVar = x1f.a;
                x1f.k(p05Var, new to3(25), 2);
                r0Var.u1.setValue(Boolean.FALSE);
                r0Var.P1(sfb.DISLIKE, r0Var.T(), null, null);
                return wefVar;
            case 4:
                x1f x1fVar2 = x1f.a;
                x1f.k(p05Var, new to3(16), 2);
                jd4 jd4VarA0 = r0Var.a0();
                fd4 fd4Var = jd4VarA0 instanceof fd4 ? (fd4) jd4VarA0 : null;
                if (fd4Var != null) {
                    r0Var.K1(fd4Var.a);
                    r0Var.M0(Operation.Pattern.INSTANCE);
                }
                return wefVar;
            case 5:
                jd4 jd4VarA1 = r0Var.a0();
                jsd jsdVar2 = r0Var.R0;
                if (r0Var.M() == null) {
                    if (jd4VarA1 instanceof bd4) {
                        return new hb4(((bd4) jd4VarA1).b);
                    }
                    if (jd4VarA1 instanceof dd4) {
                        ArrayList arrayList2 = new ArrayList();
                        ListIterator listIterator = jsdVar2.listIterator();
                        while (true) {
                            ql6 ql6Var2 = (ql6) listIterator;
                            if (ql6Var2.hasNext()) {
                                Object next2 = ql6Var2.next();
                                if (next2 instanceof et8) {
                                    arrayList2.add(next2);
                                }
                            } else if (!arrayList2.isEmpty()) {
                                return new hb4((dd4) jd4VarA1);
                            }
                        }
                    }
                }
                return new gb4(jd4VarA1, s72.j1(jsdVar2), r0Var.d0(), r0Var.M());
            case 6:
                Set set = qp5.a;
                return qp5.a(r0Var.U0, r0Var.R0);
            case 7:
                return Boolean.valueOf(r0Var.P().f);
            case 8:
                x1f x1fVar3 = x1f.a;
                x1f.k(new r05("audio_playback"), new dl(r0Var, i2), 2);
                return wefVar;
            case 9:
                suc sucVarX = r0Var.X();
                if (!(sucVarX instanceof quc)) {
                    return null;
                }
                SpreadRecommendationResult spreadRecommendationResult = (SpreadRecommendationResult) s72.y0(((quc) sucVarX).a, r0Var.A());
                if (spreadRecommendationResult != null) {
                    return spreadRecommendationResult.getPatternData();
                }
                return null;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                suc sucVarX2 = r0Var.X();
                if (!(sucVarX2 instanceof quc)) {
                    return null;
                }
                SpreadRecommendationResult spreadRecommendationResult2 = (SpreadRecommendationResult) s72.y0(((quc) sucVarX2).a, r0Var.A());
                if (spreadRecommendationResult2 != null) {
                    return spreadRecommendationResult2.getPatternData();
                }
                return null;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                psc pscVar = psc.d;
                r0 r0Var2 = this.b;
                if (r0Var2 != null && (r0Var2.X() instanceof quc) && !r0Var2.A().isEmpty()) {
                    h hVar = (h) r0Var2.e2.getValue();
                    if (!pa7.t(hVar, d.a)) {
                        if (pa7.t(hVar, f.a) || pa7.t(hVar, g.a)) {
                            return new psc(false, null, new v74(22));
                        }
                        if (hVar instanceof e) {
                            return new psc(false, ((e) hVar).a, new sk3(0, r0Var2, r0.class, "retryAIRecommendStage2", "retryAIRecommendStage2()V", 0, 8));
                        }
                        ap.c();
                        return null;
                    }
                }
                return pscVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                if (r0Var.V() != null) {
                    r0Var.m1();
                } else if (r0Var.Q()) {
                    jcc.k(1, "Unexpected error:1001");
                } else {
                    r0Var.p1();
                }
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                r0Var.L0("reading_long_press");
                return wefVar;
            case 14:
                int i3 = r0.j2;
                if (r0Var.V() != null) {
                    str2 = "scene";
                } else {
                    str2 = r0Var.y1 != null ? "photo_reading" : "general";
                }
                r0Var.L0(str2);
                return wefVar;
            case 15:
                r0Var.R1.setValue(Boolean.TRUE);
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                Boolean bool = (Boolean) r0Var.R1.getValue();
                bool.booleanValue();
                return bool;
            case 17:
                if (r0Var != null) {
                    ConcurrentHashMap concurrentHashMap = xfb.a;
                    xfb.i(r0Var.I0, "shuffle");
                }
                if (r0Var != null) {
                    ConcurrentHashMap concurrentHashMap2 = xfb.a;
                    xfb.g(r0Var.I0);
                }
                return wefVar;
            default:
                if (r0Var != null) {
                    ConcurrentHashMap concurrentHashMap3 = xfb.a;
                    xfb.i(r0Var.I0, "cut");
                }
                if (r0Var != null) {
                    ConcurrentHashMap concurrentHashMap4 = xfb.a;
                    xfb.a(r0Var.I0);
                }
                return wefVar;
        }
    }
}
