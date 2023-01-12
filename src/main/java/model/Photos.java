package model;

import jakarta.persistence.*;


public class Photos {
	@Entity
	@Table(name = "photos")
	public class Photo {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;

	    @ManyToOne
	    @JoinColumn(name = "project_id")
	    private Project project;

	    @Column(name = "path")
	    private String path;
	    //getters and setters

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public Project getProject() {
			return project;
		}

		public void setProject(Project project) {
			this.project = project;
		}

		public String getPath() {
			return path;
		}

		public void setPath(String path) {
			this.path = path;
		}
	}
}

