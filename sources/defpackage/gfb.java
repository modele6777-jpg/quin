package defpackage;

import java.util.Iterator;
import java.util.List;
import tech.chatmind.api.ReadingFeedbackTag;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gfb implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ gfb(List list, int i) {
        this.a = i;
        this.b = list;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        List list = this.b;
        switch (i) {
            case 0:
                ReadingFeedbackTag readingFeedbackTag = (ReadingFeedbackTag) obj;
                readingFeedbackTag.getClass();
                if (!list.contains(readingFeedbackTag.getKey())) {
                    list.add(readingFeedbackTag.getKey());
                } else {
                    list.remove(readingFeedbackTag.getKey());
                }
                break;
            default:
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((lu3) it.next()).b();
                }
                break;
        }
        return wefVar;
    }
}
