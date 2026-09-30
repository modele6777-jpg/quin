package defpackage;

import tech.chatmind.api.Message;
import tech.chatmind.api.Role;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public interface ot8 {
    default Message a() {
        if (this instanceof nt8) {
            return new Message(Role.USER, ((nt8) this).a);
        }
        if (this instanceof ct8) {
            return new Message(Role.ASSISTANT, ((ct8) this).a);
        }
        if (this instanceof lt8) {
            return new Message(Role.ASSISTANT, ((lt8) this).a);
        }
        if (this instanceof kt8) {
            return new Message(Role.ASSISTANT, ((kt8) this).b);
        }
        if (this instanceof dt8) {
            return null;
        }
        if (this instanceof et8) {
            et8 et8Var = (et8) this;
            if (et8Var.c) {
                return new Message(Role.ASSISTANT, et8Var.b);
            }
            return null;
        }
        if (this instanceof gt8) {
            return new Message(Role.ASSISTANT, ((gt8) this).b);
        }
        if ((this instanceof ht8) || (this instanceof ft8) || (this instanceof jt8)) {
            return null;
        }
        ap.c();
        return null;
    }
}
