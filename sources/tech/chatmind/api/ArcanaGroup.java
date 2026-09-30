package tech.chatmind.api;

import defpackage.ab0;
import defpackage.eb3;
import defpackage.kc0;
import defpackage.lw7;
import defpackage.lx4;
import defpackage.o2;
import defpackage.pa7;
import defpackage.s72;
import defpackage.tyc;
import defpackage.wn2;
import defpackage.xn7;
import defpackage.z18;
import defpackage.z7c;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0017\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Ltech/chatmind/api/ArcanaGroup;", "", "", "Ltech/chatmind/api/TarotCardType;", "types", "<init>", "(Ljava/lang/String;ILjava/util/List;)V", "Ljava/util/List;", "getTypes", "()Ljava/util/List;", "Companion", "kc0", "Major", "Wands", "Cups", "Swords", "Pentacles", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public enum ArcanaGroup {
    Major(s72.c1(TarotCardType.getEntries(), 22)),
    Wands(((o2) TarotCardType.getEntries()).subList(22, 36)),
    Cups(((o2) TarotCardType.getEntries()).subList(36, 50)),
    Swords(((o2) TarotCardType.getEntries()).subList(50, 64)),
    Pentacles(((o2) TarotCardType.getEntries()).subList(64, 78));

    private final List<TarotCardType> types;
    private static final /* synthetic */ lx4 $ENTRIES = pa7.Q(values());
    public static final kc0 Companion = new kc0();
    private static final lw7 $cachedSerializer$delegate = eb3.N(z18.b, new ab0(29));

    ArcanaGroup(List list) {
        this.types = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xn7 _init_$_anonymous_() {
        ArcanaGroup[] arcanaGroupArrValues = values();
        arcanaGroupArrValues.getClass();
        return new wn2("tech.chatmind.api.ArcanaGroup", arcanaGroupArrValues);
    }

    public static lx4 getEntries() {
        return $ENTRIES;
    }

    public final List<TarotCardType> getTypes() {
        return this.types;
    }
}
