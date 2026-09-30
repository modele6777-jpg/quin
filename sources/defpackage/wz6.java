package defpackage;

import ai.askquin.data.InAppMessageUiModel;
import tech.chatmind.api.message.model.InAppMessageType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wz6 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ InAppMessageUiModel b;

    public /* synthetic */ wz6(InAppMessageUiModel inAppMessageUiModel, int i) {
        this.a = i;
        this.b = inAppMessageUiModel;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        InAppMessageUiModel inAppMessageUiModel = this.b;
        switch (i) {
            case 0:
                l1f l1fVar = (l1f) obj;
                l1fVar.getClass();
                inAppMessageUiModel.getClass();
                bm8.H(new iy9("btn", "inbox_action"), new iy9("page_name", "inbox"), new iy9("message_id", inAppMessageUiModel.getMessageId()), new iy9("message_type", InAppMessageType.Companion.serializer().e().f(inAppMessageUiModel.getMessageType().ordinal()))).forEach(new al(new gl(2, l1fVar, l1f.class, "param", "param(Ljava/lang/String;Ljava/lang/Object;)V", 0, 21), 4));
                break;
            default:
                l1f l1fVar2 = (l1f) obj;
                l1fVar2.getClass();
                String messageId = inAppMessageUiModel.getMessageId();
                fl8 fl8Var = new fl8();
                fl8Var.put("element", "inbox_message");
                fl8Var.put("page_name", "inbox");
                fl8Var.put("pathway", "inbox");
                if (messageId != null) {
                    fl8Var.put("item_id", messageId);
                }
                bm8.L(fl8Var.j(), bm8.H(new iy9("message_type", InAppMessageType.Companion.serializer().e().f(inAppMessageUiModel.getMessageType().ordinal())), new iy9("has_action", Boolean.valueOf(kj0.j0(inAppMessageUiModel))))).forEach(new al(new gl(2, l1fVar2, l1f.class, "param", "param(Ljava/lang/String;Ljava/lang/Object;)V", 0, 20), 5));
                break;
        }
        return wefVar;
    }
}
