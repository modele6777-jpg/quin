package tech.chatmind.api.seasonal.model;

import defpackage.ap;
import defpackage.atd;
import defpackage.eb3;
import defpackage.lw7;
import defpackage.lx4;
import defpackage.nk8;
import defpackage.ond;
import defpackage.pa7;
import defpackage.tyc;
import defpackage.xn7;
import defpackage.z18;
import defpackage.z7c;
import defpackage.zsd;
import java.lang.annotation.Annotation;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Ltech/chatmind/api/seasonal/model/SolarTerm;", "", "<init>", "(Ljava/lang/String;I)V", "", "getWireValue", "()Ljava/lang/String;", "wireValue", "Companion", "zsd", "SPRING_EQUINOX", "SUMMER_SOLSTICE", "AUTUMN_EQUINOX", "WINTER_SOLSTICE", "UNKNOWN", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public enum SolarTerm {
    SPRING_EQUINOX,
    SUMMER_SOLSTICE,
    AUTUMN_EQUINOX,
    WINTER_SOLSTICE,
    UNKNOWN;

    private static final /* synthetic */ lx4 $ENTRIES = pa7.Q(values());
    public static final zsd Companion = new zsd();
    private static final lw7 $cachedSerializer$delegate = eb3.N(z18.b, new ond(3));

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _init_$_anonymous_() {
        return nk8.p("tech.chatmind.api.seasonal.model.SolarTerm", values(), new String[]{"springEquinox", "summerSolstice", "autumnEquinox", "winterSolstice", "__unknown__"}, new Annotation[][]{null, null, null, null, null});
    }

    public static lx4 getEntries() {
        return $ENTRIES;
    }

    public final String getWireValue() {
        int i = atd.a[ordinal()];
        if (i == 1) {
            return "springEquinox";
        }
        if (i == 2) {
            return "summerSolstice";
        }
        if (i == 3) {
            return "autumnEquinox";
        }
        if (i == 4) {
            return "winterSolstice";
        }
        if (i == 5) {
            return "__unknown__";
        }
        ap.c();
        return null;
    }
}
