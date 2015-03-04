package org.insightech.er.db.impl.sqlserver;

import org.insightech.er.editor.model.dbimport.PreImportFromDBManager;

public class SqlServerPreTableImportManager extends PreImportFromDBManager {

	@Override
	protected String getTableNameWithSchema(String schema, String tableName) {
		return "[" + super.getTableNameWithSchema(schema, tableName) + "]";
	}

}
