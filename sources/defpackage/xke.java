package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xke {
    public static TarotSkinIdentify a(n2f n2fVar) {
        n2fVar.getClass();
        switch (n2fVar.ordinal()) {
            case 0:
                return TarotSkinIdentify.Classic;
            case 1:
                return TarotSkinIdentify.NeoRiderWaite;
            case 2:
                return TarotSkinIdentify.Cat;
            case 3:
                return TarotSkinIdentify.Love;
            case 4:
                return TarotSkinIdentify.Puppet;
            case 5:
                return TarotSkinIdentify.Symbolism;
            case 6:
                return TarotSkinIdentify.Minimalism;
            case 7:
                return TarotSkinIdentify.Classic;
            case 8:
                return TarotSkinIdentify.Fable;
            case 9:
                return TarotSkinIdentify.Woodcut;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return TarotSkinIdentify.Dream;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return TarotSkinIdentify.Prism;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return TarotSkinIdentify.Midnight;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return TarotSkinIdentify.DarkGold;
            case 14:
                return TarotSkinIdentify.ZenithDay;
            case 15:
                return TarotSkinIdentify.EternalNight;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return TarotSkinIdentify.Transformation;
            case 17:
                return TarotSkinIdentify.SecretManor;
            case 18:
                return TarotSkinIdentify.MagicAwakening;
            default:
                ap.c();
                return null;
        }
    }

    public final xn7 serializer() {
        return (xn7) TarotSkinIdentify.$cachedSerializer$delegate.getValue();
    }
}
