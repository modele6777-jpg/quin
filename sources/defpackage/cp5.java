package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tech.chatmind.api.ChatTextMessage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class cp5 {
    public static final m8b a;

    static {
        hf8.Q.getClass();
        a = ef8.a("FollowUpMessageMapper");
    }

    public static void a(ChatTextMessage chatTextMessage, String str) {
        String type = chatTextMessage.getType();
        if (v4e.Q(type)) {
            type = "<blank>";
        }
        String role = chatTextMessage.getRole();
        a.g("Drop follow-up message: type=" + ((Object) type) + ", role=" + ((Object) (v4e.Q(role) ? "<blank>" : role)) + ", reason=" + str);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:108:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:190:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b3  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v6 java.lang.Object, still in use, count: 2, list:
          (r7v6 java.lang.Object) from 0x00a2: PHI (r7 I:??) = (r7v4 java.lang.Object), (r7v6 java.lang.Object) binds: [B:32:0x00a1, B:196:0x00a2] A[DONT_GENERATE, DONT_INLINE]
          (r7v6 java.lang.Object) from 0x0090: CHECK_CAST (tech.chatmind.api.TarotCardType) (r7v6 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public static defpackage.ot8 b(tech.chatmind.api.ChatTextMessage r15) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 744
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cp5.b(tech.chatmind.api.ChatTextMessage):ot8");
    }

    public static ArrayList c(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ot8 ot8VarB = b((ChatTextMessage) it.next());
            if (ot8VarB != null) {
                arrayList.add(ot8VarB);
            }
        }
        return arrayList;
    }

    public static String d(String str) {
        String string;
        if (str == null || (string = v4e.o0(str).toString()) == null || string.length() <= 0) {
            return null;
        }
        return string;
    }
}
