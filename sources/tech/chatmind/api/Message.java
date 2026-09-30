package tech.chatmind.api;

import defpackage.ag2;
import defpackage.an1;
import defpackage.bt8;
import defpackage.eb3;
import defpackage.fk8;
import defpackage.it8;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.tyc;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006*"}, d2 = {"Ltech/chatmind/api/Message;", "", "Ltech/chatmind/api/Role;", "role", "", "content", "<init>", "(Ltech/chatmind/api/Role;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILtech/chatmind/api/Role;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/Message;Lag2;Lnyc;)V", "write$Self", "component1", "()Ltech/chatmind/api/Role;", "component2", "()Ljava/lang/String;", "copy", "(Ltech/chatmind/api/Role;Ljava/lang/String;)Ltech/chatmind/api/Message;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ltech/chatmind/api/Role;", "getRole", "Ljava/lang/String;", "getContent", "Companion", "bt8", "it8", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class Message {
    public static final int $stable = 0;
    private final String content;
    private final Role role;
    public static final it8 Companion = new it8();
    private static final lw7[] $childSerializers = {eb3.N(z18.b, new fk8(5)), null};

    public /* synthetic */ Message(int i, Role role, String str, xyc xycVar) {
        if (3 != (i & 3)) {
            an1.R(i, 3, bt8.a.e());
            throw null;
        }
        this.role = role;
        this.content = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return Role.Companion.serializer();
    }

    public static /* synthetic */ Message copy$default(Message message, Role role, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            role = message.role;
        }
        if ((i & 2) != 0) {
            str = message.content;
        }
        return message.copy(role, str);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(Message self, ag2 output, nyc serialDesc) {
        output.p(serialDesc, 0, (xn7) $childSerializers[0].getValue(), self.role);
        output.w(serialDesc, 1, self.content);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Role getRole() {
        return this.role;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    public final Message copy(Role role, String content) {
        role.getClass();
        content.getClass();
        return new Message(role, content);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Message)) {
            return false;
        }
        Message message = (Message) other;
        return this.role == message.role && pa7.t(this.content, message.content);
    }

    public final String getContent() {
        return this.content;
    }

    public final Role getRole() {
        return this.role;
    }

    public int hashCode() {
        return this.content.hashCode() + (this.role.hashCode() * 31);
    }

    public String toString() {
        return "Message(role=" + this.role + ", content=" + this.content + ")";
    }

    public Message(Role role, String str) {
        role.getClass();
        str.getClass();
        this.role = role;
        this.content = str;
    }
}
