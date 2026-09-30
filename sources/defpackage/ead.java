package defpackage;

import ai.askquin.ui.share.SharePayload$DrawnCards;
import ai.askquin.ui.share.SharedConversationEntry;
import ai.askquin.ui.share.SharedConversationEntryType;
import ai.askquin.ui.share.SharedDivination;
import ai.askquin.ui.skin.download.SkinDownloadWorker;
import ai.askquin.ui.skin.navigation.SkinNavigationRoute$AllCardBySkinRoute;
import ai.askquin.ui.skin.navigation.SkinNavigationRoute$SkinDetailRoute;
import ai.askquin.ui.skin.navigation.SkinNavigationRoute$SkinGraphEntryRoute;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.concurrent.TimeUnit;
import tech.chatmind.api.ShareSummaryContent;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ead implements x16 {
    public final /* synthetic */ int a;

    public /* synthetic */ ead(int i) {
        this.a = i;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                return SharePayload$DrawnCards._childSerializers$_anonymous_();
            case 1:
                return SharePayload$DrawnCards._childSerializers$_anonymous_$0();
            case 2:
                return Boolean.FALSE;
            case 3:
                return 67108864;
            case 4:
                return new e2d(17);
            case 5:
                return ShareSummaryContent._childSerializers$_anonymous_();
            case 6:
                return SharedConversationEntry._childSerializers$_anonymous_();
            case 7:
                return SharedConversationEntry._childSerializers$_anonymous_$0();
            case 8:
                return SharedConversationEntryType._init_$_anonymous_();
            case 9:
                return SharedDivination._childSerializers$_anonymous_();
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return SharedDivination._childSerializers$_anonymous_$0();
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return SharedDivination._childSerializers$_anonymous_$1();
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return null;
            case 14:
            case 15:
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
            case 17:
                return wefVar;
            case 18:
                vhd[] vhdVarArrValues = vhd.values();
                vhdVarArrValues.getClass();
                return new wn2("net.xmind.donut.common.track.SignUpDestination", vhdVarArrValues);
            case 19:
                return q1c.f(null);
            case 20:
                return wefVar;
            case 21:
                return q1c.f(Boolean.FALSE);
            case 22:
                return q1c.f(Boolean.FALSE);
            case 23:
                int i2 = SkinDownloadWorker.x;
                gm9 gm9Var = new gm9();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                timeUnit.getClass();
                gm9Var.x = keg.b(30L);
                gm9Var.a(60L);
                timeUnit.getClass();
                gm9Var.z = keg.b(60L);
                return new hm9(gm9Var);
            case 24:
                return db6.A0(Boolean.FALSE);
            case 25:
                return db6.A0(Boolean.TRUE);
            case 26:
                x1f x1fVar = x1f.a;
                x1f.k(new r05("popup_view"), new e2d(27), 2);
                return wefVar;
            case 27:
                return SkinNavigationRoute$AllCardBySkinRoute._childSerializers$_anonymous_();
            case 28:
                return SkinNavigationRoute$SkinDetailRoute._childSerializers$_anonymous_();
            default:
                return SkinNavigationRoute$SkinGraphEntryRoute._childSerializers$_anonymous_();
        }
    }
}
