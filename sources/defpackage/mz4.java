package defpackage;

import ai.askquin.R;
import ai.askquin.ui.conversation.FailReason;
import ai.askquin.ui.explore.skin.navigation.ExploreTarotRoute$DeckCarousel;
import ai.askquin.ui.explore.skin.navigation.ExploreTarotRoute$Detail;
import ai.askquin.ui.explore.skin.navigation.ExploreTarotRoute$GraphEntry;
import ai.askquin.ui.fourseasons.FourSeasonsIntroRoute;
import ai.askquin.ui.paywall.upgrade.FiveCardUpgradePending;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import tech.chatmind.api.FeedbackRequest;
import tech.chatmind.api.Gender;
import tech.chatmind.api.events.model.EventInfo;
import tech.chatmind.api.events.model.EventInfo2;
import tech.chatmind.api.events.model.EventType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mz4 implements x16 {
    public final /* synthetic */ int a;

    public /* synthetic */ mz4(int i) {
        this.a = i;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        Class<?> returnType;
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                return EventInfo._childSerializers$_anonymous_$2();
            case 1:
                return EventInfo2._childSerializers$_anonymous_();
            case 2:
                return EventInfo2._childSerializers$_anonymous_$0();
            case 3:
                return EventInfo2._childSerializers$_anonymous_$1();
            case 4:
                return EventInfo2._childSerializers$_anonymous_$2();
            case 5:
                return EventType._init_$_anonymous_();
            case 6:
                return Long.valueOf(System.nanoTime() / 1000000);
            case 7:
                return ExploreTarotRoute$DeckCarousel._childSerializers$_anonymous_();
            case 8:
                return ExploreTarotRoute$Detail._childSerializers$_anonymous_();
            case 9:
                return ExploreTarotRoute$GraphEntry._childSerializers$_anonymous_();
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return FailReason.Network._init_$_anonymous_();
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return FailReason.NoFreeCount._init_$_anonymous_();
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return FailReason.NoRemainingTokens._init_$_anonymous_();
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return FailReason.Unauthorized._init_$_anonymous_();
            case 14:
                return FailReason.UsageBlocked._childSerializers$_anonymous_();
            case 15:
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return FeedbackRequest._childSerializers$_anonymous_();
            case 17:
                return FeedbackRequest._childSerializers$_anonymous_$0();
            case 18:
                hm9 hm9Var = (hm9) jk9.b.getValue();
                da4 da4Var = new da4();
                da4Var.f(8);
                da4Var.g(4);
                hm9Var.getClass();
                gm9 gm9VarA = hm9Var.a();
                gm9VarA.a = da4Var;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                timeUnit.getClass();
                gm9VarA.x = keg.b(30L);
                gm9VarA.a(60L);
                timeUnit.getClass();
                gm9VarA.z = keg.b(60L);
                return new hm9(gm9VarA);
            case 19:
                return FiveCardUpgradePending._childSerializers$_anonymous_();
            case 20:
                List listAsList = Arrays.asList(urg.f(R.font.truetype, ar5.w, 12));
                listAsList.getClass();
                return new cq5(listAsList);
            case 21:
                return 0;
            case 22:
                return FourSeasonsIntroRoute._init_$_anonymous_();
            case 23:
                return q1c.f(Boolean.FALSE);
            case 24:
                return 3;
            case 25:
                return wefVar;
            case 26:
                return bx5.a;
            case 27:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 28:
                try {
                    Method method = (Method) gz5.d.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    Class cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused2) {
                    return null;
                }
            default:
                return Gender._init_$_anonymous_();
        }
    }
}
