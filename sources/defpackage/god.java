package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import android.content.Context;
import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class god extends gbe implements n26 {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        god godVar = new god(3, (xn2) obj3);
        godVar.L$0 = (mfc) obj;
        godVar.L$1 = (yof) obj2;
        return godVar.r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        sp1 sp1Var;
        mfc mfcVar = (mfc) this.L$0;
        yof yofVar = (yof) this.L$1;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        xke xkeVar = TarotSkinIdentify.Companion;
        n2f n2fVar = yofVar.g;
        xkeVar.getClass();
        TarotSkinIdentify tarotSkinIdentifyA = xke.a(n2fVar);
        switch (fod.a[tarotSkinIdentifyA.ordinal()]) {
            case 1:
                sp1Var = sp1.Cat;
                break;
            case 2:
                sp1Var = sp1.Romantic;
                break;
            case 3:
                sp1Var = sp1.Puppet;
                break;
            case 4:
                sp1Var = sp1.Symbolism;
                break;
            case 5:
                sp1Var = sp1.Minimalism;
                break;
            case 6:
                sp1Var = sp1.Fable;
                break;
            case 7:
                sp1Var = sp1.Woodcut;
                break;
            case 8:
                sp1Var = sp1.Dream;
                break;
            case 9:
                sp1Var = sp1.Prism;
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                sp1Var = sp1.Midnight;
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                sp1Var = sp1.DarkGold;
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                sp1Var = sp1.ZenithDay;
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                sp1Var = sp1.EternalNight;
                break;
            case 14:
                sp1Var = sp1.Transformation;
                break;
            case 15:
                sp1Var = sp1.SecretManor;
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                sp1Var = sp1.MagicAwakening;
                break;
            case 17:
            case 18:
                int iOrdinal = mfcVar.ordinal();
                i8c i8cVar = sp1.a;
                if (iOrdinal == 0) {
                    Context context = cn1.P0;
                    context.getClass();
                    boolean zB = li4.b(context);
                    i8cVar.getClass();
                    sp1Var = !zB ? sp1.Light : sp1.Dark;
                } else {
                    if (iOrdinal != 1) {
                        ap.c();
                        return null;
                    }
                    i8cVar.getClass();
                    sp1Var = sp1.NEO;
                }
                break;
            default:
                ap.c();
                return null;
        }
        return new die(tarotSkinIdentifyA, sp1Var);
    }
}
