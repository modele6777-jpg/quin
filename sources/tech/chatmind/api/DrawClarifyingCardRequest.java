package tech.chatmind.api;

import defpackage.ag2;
import defpackage.an1;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.ks0;
import defpackage.kuc;
import defpackage.ln4;
import defpackage.lw7;
import defpackage.mn4;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.rp3;
import defpackage.tec;
import defpackage.tyc;
import defpackage.v74;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J4\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b*\u0010\u0019¨\u0006."}, d2 = {"Ltech/chatmind/api/DrawClarifyingCardRequest;", "", "", "type", "", "Ltech/chatmind/api/SelectedCard;", "cards", "requestClarifyingCardMessageId", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/DrawClarifyingCardRequest;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Ltech/chatmind/api/DrawClarifyingCardRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "Ljava/util/List;", "getCards", "getRequestClarifyingCardMessageId", "Companion", "ln4", "mn4", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class DrawClarifyingCardRequest {
    public static final int $stable = 8;
    private final List<SelectedCard> cards;
    private final String requestClarifyingCardMessageId;
    private final String type;
    public static final mn4 Companion = new mn4();
    private static final lw7[] $childSerializers = {null, eb3.N(z18.b, new v74(20)), null};

    public /* synthetic */ DrawClarifyingCardRequest(int i, String str, List list, String str2, xyc xycVar) {
        if (6 != (i & 6)) {
            an1.R(i, 6, ln4.a.e());
            throw null;
        }
        if ((i & 1) == 0) {
            this.type = "draw-clarifying-card";
        } else {
            this.type = str;
        }
        this.cards = list;
        this.requestClarifyingCardMessageId = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return new dd0(kuc.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DrawClarifyingCardRequest copy$default(DrawClarifyingCardRequest drawClarifyingCardRequest, String str, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = drawClarifyingCardRequest.type;
        }
        if ((i & 2) != 0) {
            list = drawClarifyingCardRequest.cards;
        }
        if ((i & 4) != 0) {
            str2 = drawClarifyingCardRequest.requestClarifyingCardMessageId;
        }
        return drawClarifyingCardRequest.copy(str, list, str2);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(DrawClarifyingCardRequest self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        if (output.g(serialDesc) || !pa7.t(self.type, "draw-clarifying-card")) {
            output.w(serialDesc, 0, self.type);
        }
        output.p(serialDesc, 1, (xn7) lw7VarArr[1].getValue(), self.cards);
        output.w(serialDesc, 2, self.requestClarifyingCardMessageId);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final List<SelectedCard> component2() {
        return this.cards;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRequestClarifyingCardMessageId() {
        return this.requestClarifyingCardMessageId;
    }

    public final DrawClarifyingCardRequest copy(String type, List<SelectedCard> cards, String requestClarifyingCardMessageId) {
        type.getClass();
        cards.getClass();
        requestClarifyingCardMessageId.getClass();
        return new DrawClarifyingCardRequest(type, cards, requestClarifyingCardMessageId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DrawClarifyingCardRequest)) {
            return false;
        }
        DrawClarifyingCardRequest drawClarifyingCardRequest = (DrawClarifyingCardRequest) other;
        return pa7.t(this.type, drawClarifyingCardRequest.type) && pa7.t(this.cards, drawClarifyingCardRequest.cards) && pa7.t(this.requestClarifyingCardMessageId, drawClarifyingCardRequest.requestClarifyingCardMessageId);
    }

    public final List<SelectedCard> getCards() {
        return this.cards;
    }

    public final String getRequestClarifyingCardMessageId() {
        return this.requestClarifyingCardMessageId;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.requestClarifyingCardMessageId.hashCode() + tec.a(this.type.hashCode() * 31, 31, this.cards);
    }

    public String toString() {
        String str = this.type;
        List<SelectedCard> list = this.cards;
        String str2 = this.requestClarifyingCardMessageId;
        StringBuilder sb = new StringBuilder("DrawClarifyingCardRequest(type=");
        sb.append(str);
        sb.append(", cards=");
        sb.append(list);
        sb.append(", requestClarifyingCardMessageId=");
        return ks0.l(sb, str2, ")");
    }

    public DrawClarifyingCardRequest(String str, List<SelectedCard> list, String str2) {
        str.getClass();
        list.getClass();
        str2.getClass();
        this.type = str;
        this.cards = list;
        this.requestClarifyingCardMessageId = str2;
    }

    public /* synthetic */ DrawClarifyingCardRequest(String str, List list, String str2, int i, rp3 rp3Var) {
        this((i & 1) != 0 ? "draw-clarifying-card" : str, list, str2);
    }
}
