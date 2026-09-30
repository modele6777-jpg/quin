package defpackage;

import ai.askquin.ui.dailycard.DailyCardEntry;
import ai.askquin.ui.dailycard.ViewDailyCardRoute;
import ai.askquin.ui.popup.dailyfortune.DailyFortuneGuideTrigger;
import android.app.Activity;
import android.os.CancellationSignal;
import com.canhub.cropper.CropImageActivity;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import io.sentry.android.core.b1;
import java.io.IOException;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import tech.chatmind.api.ArcanaGroup;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ot1 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ot1(vs4 vs4Var, fz3 fz3Var) {
        this.a = 23;
        this.b = vs4Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        String strConcat;
        int length;
        int i;
        String str;
        int i2 = this.a;
        int i3 = 2;
        boolean z = true;
        boolean z2 = true;
        Object obj2 = this.b;
        switch (i2) {
            case 0:
                bv7 bv7Var = (bv7) obj;
                bv7Var.getClass();
                ((qt1) obj2).b.setValue(z5c.g(bv7Var.N(0L), db6.Y0(bv7Var.l())));
                return wef.a;
            case 1:
                CancellationSignal cancellationSignal = (CancellationSignal) obj2;
                if (((Throwable) obj) != null) {
                    cancellationSignal.cancel();
                }
                return wef.a;
            case 2:
                ((ra4) obj).getClass();
                return new lf(10, (Activity) obj2);
            case 3:
                qf2 qf2Var = (qf2) obj2;
                iv ivVar = qf2Var.x;
                if (ivVar != null) {
                    return ivVar;
                }
                iv ivVar2 = new iv(qf2Var.a);
                qf2Var.x = ivVar2;
                return ivVar2;
            case 4:
                mma mmaVar = (mma) obj2;
                ((ra4) obj).getClass();
                int i4 = 0;
                Class<mma> cls = mma.class;
                w wVar = new w(1, mmaVar, cls, "debugShowDailyFortuneGuide", "debugShowDailyFortuneGuide$Quin_conversation_gpRelease(Lai/askquin/ui/popup/dailyfortune/DailyFortuneGuideTrigger;)V", i4, 18);
                int i5 = 0;
                hl hlVar = new hl(i5, mmaVar, cls, "debugHideDailyFortuneGuide", "debugHideDailyFortuneGuide()V", i4, 13);
                pa7.g = wVar;
                pa7.h = hlVar;
                jrb.a = new hl(i5, mmaVar, cls, "debugShowWeekendFreePopup", "debugShowWeekendFreePopup()V", i4, 14);
                return new ou(z ? 1 : 0);
            case 5:
                p3c p3cVar = (p3c) obj2;
                ((ra4) obj).getClass();
                Object obj3 = new Object();
                AtomicReference atomicReference = t3b.a;
                t3b.a.set(new s3b(obj3, new hl(0, p3cVar, p3c.class, "showReviewRewardPromptForQa", "showReviewRewardPromptForQa$Quin_conversation_gpRelease()V", 0, 25)));
                return new jt2(z2 ? 1 : 0, obj3);
            case 6:
                la1 la1Var = (la1) obj2;
                Throwable th = (Throwable) obj;
                if (th == null) {
                    la1Var.b(null);
                } else if (th instanceof CancellationException) {
                    la1Var.c();
                } else {
                    la1Var.d(th);
                }
                return wef.a;
            case 7:
                int i6 = CropImageActivity.X0;
                ((qm9) obj).getClass();
                ((CropImageActivity) obj2).w();
                return wef.a;
            case 8:
                l1f l1fVar = (l1f) obj;
                l1fVar.a("daily_fortune_guide", "popup");
                l1fVar.a(((DailyFortuneGuideTrigger) obj2).getAnalyticsValue(), "triggered_by");
                return wef.a;
            case 9:
                l1f l1fVar2 = (l1f) obj;
                l1fVar2.getClass();
                a63.a(l1fVar2, ((DailyCardEntry) obj2).getSource());
                return wef.a;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                l1f l1fVar3 = (l1f) obj;
                l1fVar3.getClass();
                a63.a(l1fVar3, ((ViewDailyCardRoute) obj2).getSource());
                return wef.a;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                od3 od3Var = (od3) obj2;
                ace aceVar = od3Var.j;
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    od3Var.h.M(new we5(th2));
                }
                if (aceVar.b()) {
                    ((wd5) aceVar.getValue()).close();
                }
                return wef.a;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                exc.f((hxc) obj, (String) ((iy9) obj2).d());
                return wef.a;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                ArcanaGroup arcanaGroup = (ArcanaGroup) obj;
                arcanaGroup.getClass();
                ((k75) obj2).g(nk8.t(arcanaGroup));
                return wef.a;
            case 14:
                r41 r41Var = ((gq3) obj2).b;
                Throwable cancellationException = (Throwable) obj;
                if (cancellationException == null) {
                    cancellationException = new CancellationException("Divination writer stopped");
                }
                Throwable th3 = cancellationException;
                r41Var.e(th3, false);
                while (true) {
                    aq3 aq3Var = (aq3) rw1.b(r41Var.k());
                    if (aq3Var == null) {
                        return wef.a;
                    }
                    ya2 ya2VarA = aq3Var.a();
                    if (ya2VarA != null) {
                        ((za2) ya2VarA).i0(th3);
                    }
                }
                break;
            case 15:
                l1f l1fVar4 = (l1f) obj;
                l1fVar4.getClass();
                for (Map.Entry entry : ((m16) obj2).b.entrySet()) {
                    l1fVar4.a((String) entry.getValue(), (String) entry.getKey());
                }
                return wef.a;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ((IOException) obj).getClass();
                TimeZone timeZone = keg.a;
                ((w94) obj2).y = true;
                return wef.a;
            case 17:
                ((x94) obj2).z = true;
                return wef.a;
            case 18:
                j97 j97Var = (j97) obj;
                j97Var.getClass();
                ((sd4) obj2).d(j97Var.a);
                return wef.a;
            case 19:
                cm4 cm4Var = (cm4) obj2;
                l1f l1fVar5 = (l1f) obj;
                l1fVar5.getClass();
                String str2 = cm4Var.b;
                if (str2 != null) {
                    l1fVar5.a(str2, "spread");
                }
                l1fVar5.a(Integer.valueOf(cm4Var.d.size()), "card_count");
                return wef.a;
            case 20:
                nh4 nh4Var = (nh4) obj2;
                v08 v08Var = (v08) obj;
                v08Var.getClass();
                v08.Y(v08Var, nh4Var.c.size(), null, new dd2(new wt(i3, nh4Var), true, 1463456093), 6);
                return wef.a;
            case 21:
                fj4 fj4Var = (fj4) obj2;
                lj4 lj4Var = (lj4) obj;
                if (!lj4Var.a.Y) {
                    return h4f.b;
                }
                mj4 mj4Var = lj4Var.F0;
                if (mj4Var != null) {
                    mj4Var.J(fj4Var);
                }
                lj4Var.F0 = null;
                lj4Var.E0 = null;
                return h4f.a;
            case 22:
                t66 t66Var = (t66) obj;
                return Boolean.valueOf(t66Var instanceof rl4 ? ((Boolean) ((tc2) obj2).d(t66Var)).booleanValue() : true);
            case 23:
                vs4 vs4Var = (vs4) obj;
                String str3 = ((vs4) obj2) == vs4Var ? " > " : "   ";
                if (!(vs4Var instanceof ba2)) {
                    if (vs4Var instanceof q1d) {
                        q1d q1dVar = (q1d) vs4Var;
                        length = q1dVar.a.b.length();
                        i = q1dVar.b;
                        str = "SetComposingTextCommand(text.length=";
                    } else if (vs4Var instanceof p1d) {
                        strConcat = ((p1d) vs4Var).toString();
                    } else if (vs4Var instanceof iw3) {
                        strConcat = ((iw3) vs4Var).toString();
                    } else if (vs4Var instanceof jw3) {
                        strConcat = ((jw3) vs4Var).toString();
                    } else if (vs4Var instanceof a3d) {
                        strConcat = ((a3d) vs4Var).toString();
                    } else if (vs4Var instanceof ye5) {
                        strConcat = "FinishComposingTextCommand()";
                    } else if (vs4Var instanceof fw3) {
                        strConcat = "DeleteAllCommand()";
                    } else {
                        String strR = job.a.b(vs4Var.getClass()).r();
                        if (strR == null) {
                            strR = "{anonymous EditCommand}";
                        }
                        strConcat = "Unknown EditCommand: ".concat(strR);
                    }
                    return str3.concat(strConcat);
                }
                ba2 ba2Var = (ba2) vs4Var;
                length = ba2Var.a.b.length();
                i = ba2Var.b;
                str = "CommitTextCommand(text.length=";
                strConcat = kv2.h(length, i, str, ", newCursorPosition=", ")");
                return str3.concat(strConcat);
            case 24:
                mw2 mw2Var = (mw2) obj;
                mw2Var.getClass();
                b1.n("FirebaseSessions", "CorruptionException in session data DataStore", mw2Var);
                return new j0d(((k0d) obj2).a.a(null), null, null);
            case 25:
                p89 p89Var = (p89) obj2;
                Object[] objArr = p89Var.a;
                int i7 = p89Var.c;
                for (int i8 = 0; i8 < i7; i8++) {
                    ((yn8) objArr[i8]).b();
                }
                return wef.a;
            case 26:
                l1f l1fVar6 = (l1f) obj;
                l1fVar6.getClass();
                ((rp5) obj2).b.forEach(new al(new gl(2, l1fVar6, l1f.class, "param", "param(Ljava/lang/String;Ljava/lang/Object;)V", 0, 15), i3));
                return wef.a;
            case 27:
                i9f i9fVar = (i9f) obj;
                return ((zp5) obj2).a(new i9f(null, i9fVar.b, i9fVar.c, i9fVar.d, i9fVar.e)).getValue();
            case 28:
                emc emcVar = (emc) obj2;
                l1f l1fVar7 = (l1f) obj;
                l1fVar7.getClass();
                l1fVar7.a("seasonal_reading_intro", "page_name");
                l1fVar7.a(emcVar.a, "source");
                l1fVar7.a(emcVar.b, "seasonal_period");
                return wef.a;
            default:
                vu5 vu5Var = (vu5) obj2;
                n07 n07Var = (n07) obj;
                n07Var.getClass();
                vu5Var.W0 = true;
                vu5Var.H(n07Var, ((mo3) vu5Var.Q0).a());
                return wef.a;
        }
    }

    public /* synthetic */ ot1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
