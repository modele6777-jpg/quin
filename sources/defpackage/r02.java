package defpackage;

import ai.askquin.ui.conversation.ClarifyingCardDrawActionState;
import ai.askquin.ui.conversation.ClarifyingCardSkipActionState;
import ai.askquin.ui.conversation.dialogue.ClarifyingCardState;
import ai.askquin.ui.draw.navhost.ClarifyingCardDrawingRoute;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import tech.chatmind.api.ClaimReadingsRequest;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r02 implements x16 {
    public final /* synthetic */ int a;

    public /* synthetic */ r02(int i) {
        this.a = i;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return q1c.f(w02.a);
            case 1:
                return ClaimReadingsRequest._childSerializers$_anonymous_();
            case 2:
                return ClarifyingCardDrawActionState.Failed._childSerializers$_anonymous_();
            case 3:
                return ClarifyingCardDrawActionState.Idle._init_$_anonymous_();
            case 4:
                return ClarifyingCardDrawActionState.Loading._init_$_anonymous_();
            case 5:
                return ClarifyingCardDrawingRoute._childSerializers$_anonymous_();
            case 6:
                return ClarifyingCardSkipActionState.Failed._childSerializers$_anonymous_();
            case 7:
                return ClarifyingCardSkipActionState.Idle._init_$_anonymous_();
            case 8:
                return ClarifyingCardSkipActionState.Loading._init_$_anonymous_();
            case 9:
                return ClarifyingCardState._init_$_anonymous_();
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return skd.a(cn1.z());
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return o82.e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1);
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return Boolean.TRUE;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                long jD = abg.d(4284612846L);
                long jD2 = abg.d(4281794739L);
                long jD3 = abg.d(4278442694L);
                long jD4 = abg.d(4278290310L);
                long j = y72.e;
                long jD5 = abg.d(4289724448L);
                long j2 = y72.b;
                return new y82(jD, jD2, jD3, jD4, j, j, jD5, j, j2, j2, j2, j);
            case 14:
                return q1c.f(Boolean.FALSE);
            case 15:
                return wef.a;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return wef.a;
            case 17:
                return wef.a;
            case 18:
                return wef.a;
            case 19:
                boolean z = jd9.a;
                jd9.c.put("/api/aigc/tarot-chat", new fd9(403, "{\"success\":false,\"error\":true,\"errorCode\":60022,\"errorMessage\":\"No remaining quota\",\"data\":{}}", "application/json"));
                jcc.k(0, "已开启");
                return wef.a;
            case 20:
                jd9.c.clear();
                jcc.k(0, "已清除");
                return wef.a;
            case 21:
                jk9.a.a();
                jcc.k(0, "Cookies已删除");
                return wef.a;
            case 22:
                m65 m65Var = u04.a;
                m65 m65Var2 = u04.a;
                if (m65Var2 == null || !((Boolean) m65Var2.z("seasonal-autumn-notify-popup", "dev")).booleanValue()) {
                    jcc.k(0, "请在应用内打开开发者面板后重试");
                }
                return wef.a;
            case 23:
                hs3 hs3Var = xqa.b0;
                Boolean bool = Boolean.TRUE;
                ynb.V(lw2.a, null, null, new sd2(hs3Var.a, bool, null), 3);
                jcc.k(0, "切牌提示已重置");
                return wef.a;
            case 24:
                hs3 hs3Var2 = xqa.a0;
                Boolean bool2 = Boolean.TRUE;
                ynb.V(lw2.a, null, null, new vd2(hs3Var2.a, bool2, null), 3);
                jcc.k(0, "抽卡提示已重置");
                return wef.a;
            case 25:
                ynb.V(lw2.a, null, null, new nd2(2, null), 3);
                jcc.k(0, "已设为老用户");
                return wef.a;
            case 26:
                ynb.V(lw2.a, null, null, new od2(2, null), 3);
                jcc.k(0, "已设为新用户");
                return wef.a;
            case 27:
                ynb.V(lw2.a, null, null, new pd2(2, null), 3);
                jcc.k(0, "重置检测，下次启动重新判定");
                return wef.a;
            case 28:
                return wef.a;
            default:
                return new LayoutNode(2);
        }
    }
}
