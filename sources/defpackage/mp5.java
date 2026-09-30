package defpackage;

import tech.chatmind.api.ChatTextMessage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class mp5 implements op5 {
    public final ChatTextMessage a;

    static {
        jy1 jy1Var = ChatTextMessage.Companion;
    }

    public mp5(ChatTextMessage chatTextMessage) {
        chatTextMessage.getClass();
        this.a = chatTextMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mp5) && pa7.t(this.a, ((mp5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MessageReceived(message=" + this.a + ")";
    }
}
