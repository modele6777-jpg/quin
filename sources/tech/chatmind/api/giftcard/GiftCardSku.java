package tech.chatmind.api.giftcard;

import defpackage.eb3;
import defpackage.lw7;
import defpackage.lx4;
import defpackage.nk8;
import defpackage.pa7;
import defpackage.ta6;
import defpackage.tyc;
import defpackage.w66;
import defpackage.xn7;
import defpackage.z18;
import defpackage.z7c;
import java.lang.annotation.Annotation;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Ltech/chatmind/api/giftcard/GiftCardSku;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "ta6", "OneMonth", "OneYear", "Unknown", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public enum GiftCardSku {
    OneMonth,
    OneYear,
    Unknown;

    private static final /* synthetic */ lx4 $ENTRIES = pa7.Q(values());
    public static final ta6 Companion = new ta6();
    private static final lw7 $cachedSerializer$delegate = eb3.N(z18.b, new w66(11));

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _init_$_anonymous_() {
        return nk8.p("tech.chatmind.api.giftcard.GiftCardSku", values(), new String[]{"1month", "1year", "__unknown__"}, new Annotation[][]{null, null, null});
    }

    public static lx4 getEntries() {
        return $ENTRIES;
    }
}
