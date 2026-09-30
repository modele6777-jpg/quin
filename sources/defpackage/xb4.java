package defpackage;

import ai.askquin.ui.persistence.database.DivinationDatabase_Impl;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xb4 extends gt4 {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ w5c e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb4(DivinationDatabase_Impl divinationDatabase_Impl) {
        super(21, "eff6625b9cf40655d25fe379bdcc7983", "5904753d3adadc92d867f9cbc8284bf7");
        this.e = divinationDatabase_Impl;
    }

    @Override // defpackage.gt4
    public final void a(q8c q8cVar) {
        int i = this.d;
        q8cVar.getClass();
        switch (i) {
            case 0:
                p8c.o(q8cVar, "CREATE TABLE IF NOT EXISTS `divination` (`id` TEXT NOT NULL, `createAt` TEXT NOT NULL, `updateAt` TEXT NOT NULL, `drawnAt` TEXT, `title` TEXT NOT NULL, `messageCount` INTEGER NOT NULL, `content` TEXT NOT NULL, `hasFeedback` INTEGER NOT NULL, `sceneTarot` TEXT DEFAULT NULL, `interruptedDrawing` TEXT DEFAULT NULL, `divinationType` TEXT DEFAULT NULL, `usedSkinType` TEXT DEFAULT NULL, `aiRecommendedSpreads` TEXT DEFAULT NULL, `selectedAiSpreadIndex` INTEGER DEFAULT NULL, `syncedAt` TEXT DEFAULT NULL, `isLocalOnly` INTEGER NOT NULL DEFAULT 0, `deletedAt` TEXT DEFAULT NULL, `accountId` TEXT NOT NULL DEFAULT '', `physicalDeckReading` TEXT DEFAULT NULL, `previewMessage` TEXT NOT NULL DEFAULT '', `readState` TEXT NOT NULL DEFAULT 'UNREAD', `summaryCards` TEXT DEFAULT NULL, PRIMARY KEY(`id`))");
                p8c.o(q8cVar, "CREATE INDEX IF NOT EXISTS `idx_divination_account` ON `divination` (`accountId`, `deletedAt`, `createAt`)");
                p8c.o(q8cVar, "CREATE TABLE IF NOT EXISTS `DivinationPurchaseEntity` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `chatId` TEXT NOT NULL, `productId` TEXT NOT NULL, `purchaseToken` TEXT, FOREIGN KEY(`chatId`) REFERENCES `divination`(`id`) ON UPDATE NO ACTION ON DELETE NO ACTION )");
                p8c.o(q8cVar, "CREATE INDEX IF NOT EXISTS `index_DivinationPurchaseEntity_chatId` ON `DivinationPurchaseEntity` (`chatId`)");
                p8c.o(q8cVar, "CREATE TABLE IF NOT EXISTS `divination_summary` (`divinationId` TEXT NOT NULL, `theme` TEXT NOT NULL, `summary` TEXT NOT NULL, `advice` TEXT NOT NULL, PRIMARY KEY(`divinationId`))");
                p8c.o(q8cVar, "CREATE TABLE IF NOT EXISTS `tb_in_app_message` (`message_id` TEXT NOT NULL, `message_type` TEXT NOT NULL, `region` TEXT NOT NULL, `title` TEXT, `content` TEXT NOT NULL, `image_url` TEXT, `intensity` TEXT NOT NULL, `action` TEXT, `action_tips` TEXT, `attach` TEXT, `created_at` TEXT NOT NULL, PRIMARY KEY(`message_id`))");
                p8c.o(q8cVar, "CREATE TABLE IF NOT EXISTS `PersonalityReportEntity` (`testId` TEXT NOT NULL, `reportData` TEXT NOT NULL, PRIMARY KEY(`testId`))");
                p8c.o(q8cVar, "CREATE TABLE IF NOT EXISTS `quick_decision` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `cardKey` TEXT NOT NULL, `isReversed` INTEGER NOT NULL, `answer` TEXT NOT NULL, `tagline` TEXT NOT NULL, `reading` TEXT NOT NULL, `drawnAt` TEXT NOT NULL, `chatId` TEXT NOT NULL DEFAULT '', `syncedAt` TEXT DEFAULT NULL, `accountId` TEXT NOT NULL DEFAULT '')");
                p8c.o(q8cVar, "CREATE INDEX IF NOT EXISTS `idx_quick_decision_account` ON `quick_decision` (`accountId`)");
                p8c.o(q8cVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                p8c.o(q8cVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'eff6625b9cf40655d25fe379bdcc7983')");
                break;
            default:
                p8c.o(q8cVar, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                p8c.o(q8cVar, "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
                p8c.o(q8cVar, "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
                p8c.o(q8cVar, "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `backoff_on_system_interruptions` INTEGER, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                p8c.o(q8cVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                p8c.o(q8cVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                p8c.o(q8cVar, "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                p8c.o(q8cVar, "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
                p8c.o(q8cVar, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                p8c.o(q8cVar, "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                p8c.o(q8cVar, "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
                p8c.o(q8cVar, "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                p8c.o(q8cVar, "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                p8c.o(q8cVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                p8c.o(q8cVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '08b926448d86528e697981ddd30459f7')");
                break;
        }
    }

    @Override // defpackage.gt4
    public final void c(q8c q8cVar) {
        int i = this.d;
        q8cVar.getClass();
        switch (i) {
            case 0:
                p8c.o(q8cVar, "DROP TABLE IF EXISTS `divination`");
                p8c.o(q8cVar, "DROP TABLE IF EXISTS `DivinationPurchaseEntity`");
                p8c.o(q8cVar, "DROP TABLE IF EXISTS `divination_summary`");
                p8c.o(q8cVar, "DROP TABLE IF EXISTS `tb_in_app_message`");
                p8c.o(q8cVar, "DROP TABLE IF EXISTS `PersonalityReportEntity`");
                p8c.o(q8cVar, "DROP TABLE IF EXISTS `quick_decision`");
                break;
            default:
                p8c.o(q8cVar, "DROP TABLE IF EXISTS `Dependency`");
                p8c.o(q8cVar, "DROP TABLE IF EXISTS `WorkSpec`");
                p8c.o(q8cVar, "DROP TABLE IF EXISTS `WorkTag`");
                p8c.o(q8cVar, "DROP TABLE IF EXISTS `SystemIdInfo`");
                p8c.o(q8cVar, "DROP TABLE IF EXISTS `WorkName`");
                p8c.o(q8cVar, "DROP TABLE IF EXISTS `WorkProgress`");
                p8c.o(q8cVar, "DROP TABLE IF EXISTS `Preference`");
                break;
        }
    }

    @Override // defpackage.gt4
    public final void r(q8c q8cVar) {
        int i = this.d;
        q8cVar.getClass();
    }

    @Override // defpackage.gt4
    public final void s(q8c q8cVar) {
        int i = this.d;
        w5c w5cVar = this.e;
        q8cVar.getClass();
        switch (i) {
            case 0:
                p8c.o(q8cVar, "PRAGMA foreign_keys = ON");
                ((DivinationDatabase_Impl) w5cVar).n(q8cVar);
                break;
            default:
                p8c.o(q8cVar, "PRAGMA foreign_keys = ON");
                ((WorkDatabase_Impl) w5cVar).n(q8cVar);
                break;
        }
    }

    @Override // defpackage.gt4
    public final void t(q8c q8cVar) {
        int i = this.d;
        q8cVar.getClass();
    }

    @Override // defpackage.gt4
    public final void u(q8c q8cVar) {
        int i = this.d;
        q8cVar.getClass();
        switch (i) {
            case 0:
                eb3.K(q8cVar);
                break;
            default:
                eb3.K(q8cVar);
                break;
        }
    }

    @Override // defpackage.gt4
    public final c6c v(q8c q8cVar) {
        int i = this.d;
        q8cVar.getClass();
        switch (i) {
            case 0:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("id", new kde(1, 1, "id", "TEXT", null, true));
                linkedHashMap.put("createAt", new kde(0, 1, "createAt", "TEXT", null, true));
                linkedHashMap.put("updateAt", new kde(0, 1, "updateAt", "TEXT", null, true));
                linkedHashMap.put("drawnAt", new kde(0, 1, "drawnAt", "TEXT", null, false));
                linkedHashMap.put("title", new kde(0, 1, "title", "TEXT", null, true));
                linkedHashMap.put("messageCount", new kde(0, 1, "messageCount", "INTEGER", null, true));
                linkedHashMap.put("content", new kde(0, 1, "content", "TEXT", null, true));
                linkedHashMap.put("hasFeedback", new kde(0, 1, "hasFeedback", "INTEGER", null, true));
                linkedHashMap.put("sceneTarot", new kde(0, 1, "sceneTarot", "TEXT", "NULL", false));
                linkedHashMap.put("interruptedDrawing", new kde(0, 1, "interruptedDrawing", "TEXT", "NULL", false));
                linkedHashMap.put("divinationType", new kde(0, 1, "divinationType", "TEXT", "NULL", false));
                linkedHashMap.put("usedSkinType", new kde(0, 1, "usedSkinType", "TEXT", "NULL", false));
                linkedHashMap.put("aiRecommendedSpreads", new kde(0, 1, "aiRecommendedSpreads", "TEXT", "NULL", false));
                linkedHashMap.put("selectedAiSpreadIndex", new kde(0, 1, "selectedAiSpreadIndex", "INTEGER", "NULL", false));
                linkedHashMap.put("syncedAt", new kde(0, 1, "syncedAt", "TEXT", "NULL", false));
                linkedHashMap.put("isLocalOnly", new kde(0, 1, "isLocalOnly", "INTEGER", "0", true));
                linkedHashMap.put("deletedAt", new kde(0, 1, "deletedAt", "TEXT", "NULL", false));
                linkedHashMap.put("accountId", new kde(0, 1, "accountId", "TEXT", "''", true));
                linkedHashMap.put("physicalDeckReading", new kde(0, 1, "physicalDeckReading", "TEXT", "NULL", false));
                linkedHashMap.put("previewMessage", new kde(0, 1, "previewMessage", "TEXT", "''", true));
                linkedHashMap.put("readState", new kde(0, 1, "readState", "TEXT", "'UNREAD'", true));
                linkedHashMap.put("summaryCards", new kde(0, 1, "summaryCards", "TEXT", "NULL", false));
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                linkedHashSet2.add(new mde("idx_divination_account", false, t72.I("accountId", "deletedAt", "createAt"), t72.I("ASC", "ASC", "ASC")));
                nde ndeVar = new nde("divination", linkedHashMap, linkedHashSet, linkedHashSet2);
                nde ndeVarH = q1c.h(q8cVar, "divination");
                if (!ndeVar.equals(ndeVarH)) {
                    return new c6c(false, "divination(ai.askquin.ui.persistence.database.DivinationEntity).\n Expected:\n" + ndeVar + "\n Found:\n" + ndeVarH);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("id", new kde(1, 1, "id", "INTEGER", null, true));
                linkedHashMap2.put("chatId", new kde(0, 1, "chatId", "TEXT", null, true));
                linkedHashMap2.put("productId", new kde(0, 1, "productId", "TEXT", null, true));
                linkedHashMap2.put("purchaseToken", new kde(0, 1, "purchaseToken", "TEXT", null, false));
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                linkedHashSet3.add(new lde("divination", "NO ACTION", t72.H("chatId"), t72.H("id"), "NO ACTION"));
                LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                linkedHashSet4.add(new mde("index_DivinationPurchaseEntity_chatId", false, t72.H("chatId"), t72.H("ASC")));
                nde ndeVar2 = new nde("DivinationPurchaseEntity", linkedHashMap2, linkedHashSet3, linkedHashSet4);
                nde ndeVarH2 = q1c.h(q8cVar, "DivinationPurchaseEntity");
                if (!ndeVar2.equals(ndeVarH2)) {
                    return new c6c(false, "DivinationPurchaseEntity(ai.askquin.ui.persistence.database.DivinationPurchaseEntity).\n Expected:\n" + ndeVar2 + "\n Found:\n" + ndeVarH2);
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                linkedHashMap3.put("divinationId", new kde(1, 1, "divinationId", "TEXT", null, true));
                linkedHashMap3.put("theme", new kde(0, 1, "theme", "TEXT", null, true));
                linkedHashMap3.put("summary", new kde(0, 1, "summary", "TEXT", null, true));
                linkedHashMap3.put("advice", new kde(0, 1, "advice", "TEXT", null, true));
                nde ndeVar3 = new nde("divination_summary", linkedHashMap3, new LinkedHashSet(), new LinkedHashSet());
                nde ndeVarH3 = q1c.h(q8cVar, "divination_summary");
                if (!ndeVar3.equals(ndeVarH3)) {
                    return new c6c(false, "divination_summary(ai.askquin.ui.persistence.database.DivinationShareEntity).\n Expected:\n" + ndeVar3 + "\n Found:\n" + ndeVarH3);
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                linkedHashMap4.put("message_id", new kde(1, 1, "message_id", "TEXT", null, true));
                linkedHashMap4.put("message_type", new kde(0, 1, "message_type", "TEXT", null, true));
                linkedHashMap4.put("region", new kde(0, 1, "region", "TEXT", null, true));
                linkedHashMap4.put("title", new kde(0, 1, "title", "TEXT", null, false));
                linkedHashMap4.put("content", new kde(0, 1, "content", "TEXT", null, true));
                linkedHashMap4.put("image_url", new kde(0, 1, "image_url", "TEXT", null, false));
                linkedHashMap4.put("intensity", new kde(0, 1, "intensity", "TEXT", null, true));
                linkedHashMap4.put("action", new kde(0, 1, "action", "TEXT", null, false));
                linkedHashMap4.put("action_tips", new kde(0, 1, "action_tips", "TEXT", null, false));
                linkedHashMap4.put("attach", new kde(0, 1, "attach", "TEXT", null, false));
                linkedHashMap4.put("created_at", new kde(0, 1, "created_at", "TEXT", null, true));
                nde ndeVar4 = new nde("tb_in_app_message", linkedHashMap4, new LinkedHashSet(), new LinkedHashSet());
                nde ndeVarH4 = q1c.h(q8cVar, "tb_in_app_message");
                if (!ndeVar4.equals(ndeVarH4)) {
                    return new c6c(false, "tb_in_app_message(ai.askquin.database.entities.InAppMessageEntity).\n Expected:\n" + ndeVar4 + "\n Found:\n" + ndeVarH4);
                }
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                linkedHashMap5.put("testId", new kde(1, 1, "testId", "TEXT", null, true));
                linkedHashMap5.put("reportData", new kde(0, 1, "reportData", "TEXT", null, true));
                nde ndeVar5 = new nde("PersonalityReportEntity", linkedHashMap5, new LinkedHashSet(), new LinkedHashSet());
                nde ndeVarH5 = q1c.h(q8cVar, "PersonalityReportEntity");
                if (!ndeVar5.equals(ndeVarH5)) {
                    return new c6c(false, "PersonalityReportEntity(ai.askquin.database.entities.PersonalityReportEntity).\n Expected:\n" + ndeVar5 + "\n Found:\n" + ndeVarH5);
                }
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                linkedHashMap6.put("id", new kde(1, 1, "id", "INTEGER", null, true));
                linkedHashMap6.put("cardKey", new kde(0, 1, "cardKey", "TEXT", null, true));
                linkedHashMap6.put("isReversed", new kde(0, 1, "isReversed", "INTEGER", null, true));
                linkedHashMap6.put("answer", new kde(0, 1, "answer", "TEXT", null, true));
                linkedHashMap6.put("tagline", new kde(0, 1, "tagline", "TEXT", null, true));
                linkedHashMap6.put("reading", new kde(0, 1, "reading", "TEXT", null, true));
                linkedHashMap6.put("drawnAt", new kde(0, 1, "drawnAt", "TEXT", null, true));
                linkedHashMap6.put("chatId", new kde(0, 1, "chatId", "TEXT", "''", true));
                linkedHashMap6.put("syncedAt", new kde(0, 1, "syncedAt", "TEXT", "NULL", false));
                linkedHashMap6.put("accountId", new kde(0, 1, "accountId", "TEXT", "''", true));
                LinkedHashSet linkedHashSet5 = new LinkedHashSet();
                LinkedHashSet linkedHashSet6 = new LinkedHashSet();
                linkedHashSet6.add(new mde("idx_quick_decision_account", false, t72.H("accountId"), t72.H("ASC")));
                nde ndeVar6 = new nde("quick_decision", linkedHashMap6, linkedHashSet5, linkedHashSet6);
                nde ndeVarH6 = q1c.h(q8cVar, "quick_decision");
                if (ndeVar6.equals(ndeVarH6)) {
                    return new c6c(true, (String) null);
                }
                return new c6c(false, "quick_decision(ai.askquin.ui.persistence.database.QuickDecisionEntity).\n Expected:\n" + ndeVar6 + "\n Found:\n" + ndeVarH6);
            default:
                LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                linkedHashMap7.put("work_spec_id", new kde(1, 1, "work_spec_id", "TEXT", null, true));
                linkedHashMap7.put("prerequisite_id", new kde(2, 1, "prerequisite_id", "TEXT", null, true));
                LinkedHashSet linkedHashSet7 = new LinkedHashSet();
                linkedHashSet7.add(new lde("WorkSpec", "CASCADE", t72.H("work_spec_id"), t72.H("id"), "CASCADE"));
                linkedHashSet7.add(new lde("WorkSpec", "CASCADE", t72.H("prerequisite_id"), t72.H("id"), "CASCADE"));
                LinkedHashSet linkedHashSet8 = new LinkedHashSet();
                linkedHashSet8.add(new mde("index_Dependency_work_spec_id", false, t72.H("work_spec_id"), t72.H("ASC")));
                linkedHashSet8.add(new mde("index_Dependency_prerequisite_id", false, t72.H("prerequisite_id"), t72.H("ASC")));
                nde ndeVar7 = new nde("Dependency", linkedHashMap7, linkedHashSet7, linkedHashSet8);
                nde ndeVarH7 = q1c.h(q8cVar, "Dependency");
                if (!ndeVar7.equals(ndeVarH7)) {
                    return new c6c(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + ndeVar7 + "\n Found:\n" + ndeVarH7);
                }
                LinkedHashMap linkedHashMap8 = new LinkedHashMap();
                linkedHashMap8.put("id", new kde(1, 1, "id", "TEXT", null, true));
                linkedHashMap8.put("state", new kde(0, 1, "state", "INTEGER", null, true));
                linkedHashMap8.put("worker_class_name", new kde(0, 1, "worker_class_name", "TEXT", null, true));
                linkedHashMap8.put("input_merger_class_name", new kde(0, 1, "input_merger_class_name", "TEXT", null, true));
                linkedHashMap8.put("input", new kde(0, 1, "input", "BLOB", null, true));
                linkedHashMap8.put("output", new kde(0, 1, "output", "BLOB", null, true));
                linkedHashMap8.put("initial_delay", new kde(0, 1, "initial_delay", "INTEGER", null, true));
                linkedHashMap8.put("interval_duration", new kde(0, 1, "interval_duration", "INTEGER", null, true));
                linkedHashMap8.put("flex_duration", new kde(0, 1, "flex_duration", "INTEGER", null, true));
                linkedHashMap8.put("run_attempt_count", new kde(0, 1, "run_attempt_count", "INTEGER", null, true));
                linkedHashMap8.put("backoff_policy", new kde(0, 1, "backoff_policy", "INTEGER", null, true));
                linkedHashMap8.put("backoff_delay_duration", new kde(0, 1, "backoff_delay_duration", "INTEGER", null, true));
                linkedHashMap8.put("last_enqueue_time", new kde(0, 1, "last_enqueue_time", "INTEGER", "-1", true));
                linkedHashMap8.put("minimum_retention_duration", new kde(0, 1, "minimum_retention_duration", "INTEGER", null, true));
                linkedHashMap8.put("schedule_requested_at", new kde(0, 1, "schedule_requested_at", "INTEGER", null, true));
                linkedHashMap8.put("run_in_foreground", new kde(0, 1, "run_in_foreground", "INTEGER", null, true));
                linkedHashMap8.put("out_of_quota_policy", new kde(0, 1, "out_of_quota_policy", "INTEGER", null, true));
                linkedHashMap8.put("period_count", new kde(0, 1, "period_count", "INTEGER", "0", true));
                linkedHashMap8.put("generation", new kde(0, 1, "generation", "INTEGER", "0", true));
                linkedHashMap8.put("next_schedule_time_override", new kde(0, 1, "next_schedule_time_override", "INTEGER", "9223372036854775807", true));
                linkedHashMap8.put("next_schedule_time_override_generation", new kde(0, 1, "next_schedule_time_override_generation", "INTEGER", "0", true));
                linkedHashMap8.put("stop_reason", new kde(0, 1, "stop_reason", "INTEGER", "-256", true));
                linkedHashMap8.put("trace_tag", new kde(0, 1, "trace_tag", "TEXT", null, false));
                linkedHashMap8.put("backoff_on_system_interruptions", new kde(0, 1, "backoff_on_system_interruptions", "INTEGER", null, false));
                linkedHashMap8.put("required_network_type", new kde(0, 1, "required_network_type", "INTEGER", null, true));
                linkedHashMap8.put("required_network_request", new kde(0, 1, "required_network_request", "BLOB", "x''", true));
                linkedHashMap8.put("requires_charging", new kde(0, 1, "requires_charging", "INTEGER", null, true));
                linkedHashMap8.put("requires_device_idle", new kde(0, 1, "requires_device_idle", "INTEGER", null, true));
                linkedHashMap8.put("requires_battery_not_low", new kde(0, 1, "requires_battery_not_low", "INTEGER", null, true));
                linkedHashMap8.put("requires_storage_not_low", new kde(0, 1, "requires_storage_not_low", "INTEGER", null, true));
                linkedHashMap8.put("trigger_content_update_delay", new kde(0, 1, "trigger_content_update_delay", "INTEGER", null, true));
                linkedHashMap8.put("trigger_max_content_delay", new kde(0, 1, "trigger_max_content_delay", "INTEGER", null, true));
                linkedHashMap8.put("content_uri_triggers", new kde(0, 1, "content_uri_triggers", "BLOB", null, true));
                LinkedHashSet linkedHashSet9 = new LinkedHashSet();
                LinkedHashSet linkedHashSet10 = new LinkedHashSet();
                linkedHashSet10.add(new mde("index_WorkSpec_schedule_requested_at", false, t72.H("schedule_requested_at"), t72.H("ASC")));
                linkedHashSet10.add(new mde("index_WorkSpec_last_enqueue_time", false, t72.H("last_enqueue_time"), t72.H("ASC")));
                nde ndeVar8 = new nde("WorkSpec", linkedHashMap8, linkedHashSet9, linkedHashSet10);
                nde ndeVarH8 = q1c.h(q8cVar, "WorkSpec");
                if (!ndeVar8.equals(ndeVarH8)) {
                    return new c6c(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + ndeVar8 + "\n Found:\n" + ndeVarH8);
                }
                LinkedHashMap linkedHashMap9 = new LinkedHashMap();
                linkedHashMap9.put("tag", new kde(1, 1, "tag", "TEXT", null, true));
                linkedHashMap9.put("work_spec_id", new kde(2, 1, "work_spec_id", "TEXT", null, true));
                LinkedHashSet linkedHashSet11 = new LinkedHashSet();
                linkedHashSet11.add(new lde("WorkSpec", "CASCADE", t72.H("work_spec_id"), t72.H("id"), "CASCADE"));
                LinkedHashSet linkedHashSet12 = new LinkedHashSet();
                linkedHashSet12.add(new mde("index_WorkTag_work_spec_id", false, t72.H("work_spec_id"), t72.H("ASC")));
                nde ndeVar9 = new nde("WorkTag", linkedHashMap9, linkedHashSet11, linkedHashSet12);
                nde ndeVarH9 = q1c.h(q8cVar, "WorkTag");
                if (!ndeVar9.equals(ndeVarH9)) {
                    return new c6c(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + ndeVar9 + "\n Found:\n" + ndeVarH9);
                }
                LinkedHashMap linkedHashMap10 = new LinkedHashMap();
                linkedHashMap10.put("work_spec_id", new kde(1, 1, "work_spec_id", "TEXT", null, true));
                linkedHashMap10.put("generation", new kde(2, 1, "generation", "INTEGER", "0", true));
                linkedHashMap10.put("system_id", new kde(0, 1, "system_id", "INTEGER", null, true));
                LinkedHashSet linkedHashSet13 = new LinkedHashSet();
                linkedHashSet13.add(new lde("WorkSpec", "CASCADE", t72.H("work_spec_id"), t72.H("id"), "CASCADE"));
                nde ndeVar10 = new nde("SystemIdInfo", linkedHashMap10, linkedHashSet13, new LinkedHashSet());
                nde ndeVarH10 = q1c.h(q8cVar, "SystemIdInfo");
                if (!ndeVar10.equals(ndeVarH10)) {
                    return new c6c(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + ndeVar10 + "\n Found:\n" + ndeVarH10);
                }
                LinkedHashMap linkedHashMap11 = new LinkedHashMap();
                linkedHashMap11.put("name", new kde(1, 1, "name", "TEXT", null, true));
                linkedHashMap11.put("work_spec_id", new kde(2, 1, "work_spec_id", "TEXT", null, true));
                LinkedHashSet linkedHashSet14 = new LinkedHashSet();
                linkedHashSet14.add(new lde("WorkSpec", "CASCADE", t72.H("work_spec_id"), t72.H("id"), "CASCADE"));
                LinkedHashSet linkedHashSet15 = new LinkedHashSet();
                linkedHashSet15.add(new mde("index_WorkName_work_spec_id", false, t72.H("work_spec_id"), t72.H("ASC")));
                nde ndeVar11 = new nde("WorkName", linkedHashMap11, linkedHashSet14, linkedHashSet15);
                nde ndeVarH11 = q1c.h(q8cVar, "WorkName");
                if (!ndeVar11.equals(ndeVarH11)) {
                    return new c6c(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + ndeVar11 + "\n Found:\n" + ndeVarH11);
                }
                LinkedHashMap linkedHashMap12 = new LinkedHashMap();
                linkedHashMap12.put("work_spec_id", new kde(1, 1, "work_spec_id", "TEXT", null, true));
                linkedHashMap12.put("progress", new kde(0, 1, "progress", "BLOB", null, true));
                LinkedHashSet linkedHashSet16 = new LinkedHashSet();
                linkedHashSet16.add(new lde("WorkSpec", "CASCADE", t72.H("work_spec_id"), t72.H("id"), "CASCADE"));
                nde ndeVar12 = new nde("WorkProgress", linkedHashMap12, linkedHashSet16, new LinkedHashSet());
                nde ndeVarH12 = q1c.h(q8cVar, "WorkProgress");
                if (!ndeVar12.equals(ndeVarH12)) {
                    return new c6c(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + ndeVar12 + "\n Found:\n" + ndeVarH12);
                }
                LinkedHashMap linkedHashMap13 = new LinkedHashMap();
                linkedHashMap13.put("key", new kde(1, 1, "key", "TEXT", null, true));
                linkedHashMap13.put("long_value", new kde(0, 1, "long_value", "INTEGER", null, false));
                nde ndeVar13 = new nde("Preference", linkedHashMap13, new LinkedHashSet(), new LinkedHashSet());
                nde ndeVarH13 = q1c.h(q8cVar, "Preference");
                if (ndeVar13.equals(ndeVarH13)) {
                    return new c6c(true, (String) null);
                }
                return new c6c(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + ndeVar13 + "\n Found:\n" + ndeVarH13);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb4(WorkDatabase_Impl workDatabase_Impl) {
        super(24, "08b926448d86528e697981ddd30459f7", "149fd8ad55885d3fe3549a37a0163243");
        this.e = workDatabase_Impl;
    }
}
