package tech.chatmind.api;

import defpackage.ag2;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.kje;
import defpackage.ky1;
import defpackage.lw7;
import defpackage.mie;
import defpackage.nyc;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.pu4;
import defpackage.rp3;
import defpackage.tyc;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B#\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u001a¨\u0006+"}, d2 = {"Ltech/chatmind/api/TarotReadingMessagesResponse;", "", "", "Ltech/chatmind/api/ChatTextMessage;", "messages", "", "continuationToken", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/TarotReadingMessagesResponse;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/String;)Ltech/chatmind/api/TarotReadingMessagesResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getMessages", "Ljava/lang/String;", "getContinuationToken", "Companion", "jje", "kje", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class TarotReadingMessagesResponse {
    public static final int $stable = 8;
    private final String continuationToken;
    private final List<ChatTextMessage> messages;
    public static final kje Companion = new kje();
    private static final lw7[] $childSerializers = {eb3.N(z18.b, new mie(5)), null};

    public /* synthetic */ TarotReadingMessagesResponse(int i, List list, String str, xyc xycVar) {
        this.messages = (i & 1) == 0 ? pu4.a : list;
        if ((i & 2) == 0) {
            this.continuationToken = null;
        } else {
            this.continuationToken = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return new dd0(ky1.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TarotReadingMessagesResponse copy$default(TarotReadingMessagesResponse tarotReadingMessagesResponse, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = tarotReadingMessagesResponse.messages;
        }
        if ((i & 2) != 0) {
            str = tarotReadingMessagesResponse.continuationToken;
        }
        return tarotReadingMessagesResponse.copy(list, str);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(TarotReadingMessagesResponse self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        if (output.g(serialDesc) || !pa7.t(self.messages, pu4.a)) {
            output.p(serialDesc, 0, (xn7) lw7VarArr[0].getValue(), self.messages);
        }
        if (!output.g(serialDesc) && self.continuationToken == null) {
            return;
        }
        output.A(serialDesc, 1, p4e.a, self.continuationToken);
    }

    public final List<ChatTextMessage> component1() {
        return this.messages;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContinuationToken() {
        return this.continuationToken;
    }

    public final TarotReadingMessagesResponse copy(List<ChatTextMessage> messages, String continuationToken) {
        messages.getClass();
        return new TarotReadingMessagesResponse(messages, continuationToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TarotReadingMessagesResponse)) {
            return false;
        }
        TarotReadingMessagesResponse tarotReadingMessagesResponse = (TarotReadingMessagesResponse) other;
        return pa7.t(this.messages, tarotReadingMessagesResponse.messages) && pa7.t(this.continuationToken, tarotReadingMessagesResponse.continuationToken);
    }

    public final String getContinuationToken() {
        return this.continuationToken;
    }

    public final List<ChatTextMessage> getMessages() {
        return this.messages;
    }

    public int hashCode() {
        int iHashCode = this.messages.hashCode() * 31;
        String str = this.continuationToken;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "TarotReadingMessagesResponse(messages=" + this.messages + ", continuationToken=" + this.continuationToken + ")";
    }

    public TarotReadingMessagesResponse() {
        this((List) null, (String) (0 == true ? 1 : 0), 3, (rp3) (0 == true ? 1 : 0));
    }

    public TarotReadingMessagesResponse(List<ChatTextMessage> list, String str) {
        list.getClass();
        this.messages = list;
        this.continuationToken = str;
    }

    public /* synthetic */ TarotReadingMessagesResponse(List list, String str, int i, rp3 rp3Var) {
        this((i & 1) != 0 ? pu4.a : list, (i & 2) != 0 ? null : str);
    }
}
