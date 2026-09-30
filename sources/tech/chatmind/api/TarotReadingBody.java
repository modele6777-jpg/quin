package tech.chatmind.api;

import defpackage.ag2;
import defpackage.dd0;
import defpackage.dje;
import defpackage.eb3;
import defpackage.ks0;
import defpackage.kuc;
import defpackage.lw7;
import defpackage.mie;
import defpackage.nyc;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.pu4;
import defpackage.rp3;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B-\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ6\u0010\u001d\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001bJ\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b*\u0010\u001b¨\u0006."}, d2 = {"Ltech/chatmind/api/TarotReadingBody;", "", "", "Ltech/chatmind/api/SelectedCard;", "userSelectedCards", "", "content", "createdTime", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/TarotReadingBody;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Ltech/chatmind/api/TarotReadingBody;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getUserSelectedCards", "Ljava/lang/String;", "getContent", "getCreatedTime", "Companion", "cje", "dje", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class TarotReadingBody {
    public static final int $stable = 8;
    private final String content;
    private final String createdTime;
    private final List<SelectedCard> userSelectedCards;
    public static final dje Companion = new dje();
    private static final lw7[] $childSerializers = {eb3.N(z18.b, new mie(2)), null, null};

    public /* synthetic */ TarotReadingBody(int i, List list, String str, String str2, xyc xycVar) {
        this.userSelectedCards = (i & 1) == 0 ? pu4.a : list;
        if ((i & 2) == 0) {
            this.content = "";
        } else {
            this.content = str;
        }
        if ((i & 4) == 0) {
            this.createdTime = null;
        } else {
            this.createdTime = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return new dd0(kuc.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TarotReadingBody copy$default(TarotReadingBody tarotReadingBody, List list, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = tarotReadingBody.userSelectedCards;
        }
        if ((i & 2) != 0) {
            str = tarotReadingBody.content;
        }
        if ((i & 4) != 0) {
            str2 = tarotReadingBody.createdTime;
        }
        return tarotReadingBody.copy(list, str, str2);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(TarotReadingBody self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        if (output.g(serialDesc) || !pa7.t(self.userSelectedCards, pu4.a)) {
            output.p(serialDesc, 0, (xn7) lw7VarArr[0].getValue(), self.userSelectedCards);
        }
        if (output.g(serialDesc) || !pa7.t(self.content, "")) {
            output.w(serialDesc, 1, self.content);
        }
        if (!output.g(serialDesc) && self.createdTime == null) {
            return;
        }
        output.A(serialDesc, 2, p4e.a, self.createdTime);
    }

    public final List<SelectedCard> component1() {
        return this.userSelectedCards;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCreatedTime() {
        return this.createdTime;
    }

    public final TarotReadingBody copy(List<SelectedCard> userSelectedCards, String content, String createdTime) {
        userSelectedCards.getClass();
        content.getClass();
        return new TarotReadingBody(userSelectedCards, content, createdTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TarotReadingBody)) {
            return false;
        }
        TarotReadingBody tarotReadingBody = (TarotReadingBody) other;
        return pa7.t(this.userSelectedCards, tarotReadingBody.userSelectedCards) && pa7.t(this.content, tarotReadingBody.content) && pa7.t(this.createdTime, tarotReadingBody.createdTime);
    }

    public final String getContent() {
        return this.content;
    }

    public final String getCreatedTime() {
        return this.createdTime;
    }

    public final List<SelectedCard> getUserSelectedCards() {
        return this.userSelectedCards;
    }

    public int hashCode() {
        int iC = ub3.c(this.userSelectedCards.hashCode() * 31, 31, this.content);
        String str = this.createdTime;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        List<SelectedCard> list = this.userSelectedCards;
        String str = this.content;
        String str2 = this.createdTime;
        StringBuilder sb = new StringBuilder("TarotReadingBody(userSelectedCards=");
        sb.append(list);
        sb.append(", content=");
        sb.append(str);
        sb.append(", createdTime=");
        return ks0.l(sb, str2, ")");
    }

    public TarotReadingBody() {
        this((List) null, (String) null, (String) null, 7, (rp3) null);
    }

    public TarotReadingBody(List<SelectedCard> list, String str, String str2) {
        list.getClass();
        str.getClass();
        this.userSelectedCards = list;
        this.content = str;
        this.createdTime = str2;
    }

    public /* synthetic */ TarotReadingBody(List list, String str, String str2, int i, rp3 rp3Var) {
        this((i & 1) != 0 ? pu4.a : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : str2);
    }
}
